package com.hydra.parsers;


import com.hydra.annotation.wrapper.DistributedWrapper;
import com.hydra.annotation.wrapper.ExecutorWrapper;
import com.hydra.annotation.wrapper.ExpressionWrapper;
import com.hydra.annotation.wrapper.WrapperBean;
import com.hydra.common.enums.ExpressionMeasureEnum;
import com.hydra.common.enums.ExpressionStrategyEnum;
import com.hydra.common.utils.P;
import com.hydra.common.utils.StringUtil;
import com.hydra.core.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ScheduleParser {

    /**
     * 解析作业描述
     *
     * @param details
     * @return
     */
    public Map<String,Schedule> parse(List<JobDetail> details) {
        if (null != details && !details.isEmpty()) {
            Map<String,Schedule> schedules = new HashMap<String, Schedule>();
            for (JobDetail jobDetail : details) {
                WrapperBean wrapper = jobDetail.getWrapper();
                ExecutorWrapper executorWrapper = wrapper.getExecutorWrapper();
                ExpressionWrapper expressionWrapper = wrapper.getExpressionWrapper();
                DistributedWrapper distributedWrapper = wrapper.getDistributedWrapper();
                if (null != executorWrapper && null != expressionWrapper && null != distributedWrapper) {
                    ExpressionStrategyEnum strategy = expressionWrapper.getStrategy();
                    Schedule schedule = null;
                    /**  标准策略*/
                    if(strategy.equals(ExpressionStrategyEnum.STANDARD)){
                        schedule = parserStandard(wrapper);
                    }
                    /**  定时策略*/
                    if(strategy.equals(ExpressionStrategyEnum.TIMING)){
                        schedule = parserTiming(wrapper);
                    }
                    /**  间隔策略*/
                    if(strategy.equals(ExpressionStrategyEnum.INTERVAL)){
                        schedule = parserInterval(wrapper);
                    }
                    schedules.put(jobDetail.getLabName(),schedule);
                }
            }
            P.println("ScheduleParser.parse() load schedules:{}",schedules);
            return schedules;
        }
        return null;
    }


    /**
     * 标准模式：解析
     *
     * @param wrapperBean
     * @return
     */
    private Schedule parserStandard(WrapperBean wrapperBean) {
        ExpressionWrapper expressionWrapper = wrapperBean.getExpressionWrapper();
        if (null != expressionWrapper) {
            String factor = expressionWrapper.getFactor();
            ExpressionMeasureEnum measure = expressionWrapper.getMeasure();
            if (measure != ExpressionMeasureEnum.STANDARD) {
                throw new RuntimeException("Measure must be ExpressionMeasureEnum.STANDARD for Standard model");
            }
            StandardSchedule standardSchedule = new StandardSchedule();

            if (StringUtil.isEmpty(factor)) {
                standardSchedule.setNextInvokeTime(0);
                standardSchedule.setWhetherReady(true);
            } else {

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ExpressionMeasureEnum.STANDARD.getValue());
                try {
                    Date parse = simpleDateFormat.parse(factor);
                    standardSchedule.setNextInvokeTime(parse.getTime());
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
                standardSchedule.setWhetherReady(false);

            }
            return standardSchedule;
        }
        return null;
    }

    /**
     * 定时模式解析
     *
     * @param wrapperBean
     * @return
     */
    private Schedule parserTiming(WrapperBean wrapperBean) {

        ExpressionWrapper expressionWrapper = wrapperBean.getExpressionWrapper();

        if (null != expressionWrapper) {
            ExpressionMeasureEnum measure = expressionWrapper.getMeasure();
            String factor = expressionWrapper.getFactor();
            TimingSchedule schedule = new TimingSchedule();
            schedule.setFactor(factor);
            schedule.setMeasure(measure);
            return schedule;
        }
        return null;
    }

    /**
     * 间隔模式解析
     *
     * @param wrapperBean
     * @return
     */
    private Schedule parserInterval(WrapperBean wrapperBean) {
        ExpressionWrapper expressionWrapper = wrapperBean.getExpressionWrapper();
        if (null != expressionWrapper) {
            ExpressionMeasureEnum measure = expressionWrapper.getMeasure();
            String factor = expressionWrapper.getFactor();
            IntervalSchedule schedule = new IntervalSchedule();
            schedule.setFactor(factor);
            schedule.setMeasure(measure);
            schedule.setInitDate(new Date());
            schedule.setFirstTime(true);
            return schedule;
        }
        return null;
    }


}
