package com.hydra.parsers;


import com.hydra.annotation.*;
import com.hydra.annotation.wrapper.*;
import com.hydra.common.utils.ReflectUtil;
import com.hydra.core.AnnotationJobDescription;
import com.hydra.core.JobDescription;
import com.hydra.core.JobDetail;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class AnnotationJobDescriptionParser implements JobDescriptionParser {

    public List<JobDetail> parse(JobDescription description) {

        List<JobDetail> details = new ArrayList<JobDetail>();
        AnnotationJobDescription jobDescription = null;
        if (description instanceof AnnotationJobDescription) {
            jobDescription = (AnnotationJobDescription) description;
            //所有实现了Task注解的类对象
            List<Object> objectList = jobDescription.getDescAtom();
            for (Object bean : objectList) {
                Class clazz = bean.getClass();
                Annotation annotsTask = ReflectUtil.getTypeAnnotationByName(Task.class, clazz);
                if (null != annotsTask) {
                    Method[] methods = ReflectUtil.getMethodsByAnnotation(Executor.class, clazz);
                    TaskWrapper taskWrapper = this.taskDescExt(clazz);

                    for (Method method : methods) {
                        // create a job detail
                        JobDetail jobDetail = new JobDetail();

                        WrapperBean wrapper = new WrapperBean();
                        //set TaskWrapper
                        wrapper.setTaskWrapper(taskWrapper);
                        //set executorWrapper
                        ExecutorWrapper executorWrapper = this.executorDescExt(method);
                        wrapper.setExecutorWrapper(executorWrapper);
                        //set ExpressionWrapper
                        wrapper.setExpressionWrapper(this.expressionDescExt(method));
                        // set JoinWrapper
                        wrapper.setJoinWrapper(this.joinDescExt(method));
                        //set DistributedWrapper
                        wrapper.setDistributedWrapper(this.distributedDescExt(method));
                        String labName = taskWrapper.getName() + "@" + executorWrapper.getValue();
                        jobDetail.setWrapper(wrapper);
                        jobDetail.setLabName(labName);
                        jobDetail.setInstance(bean);
                        jobDetail.setInvokeMethod(method);

                        details.add(jobDetail);
                    }


                }
            }

        } else {
            return null;
        }

        return details;
    }

    /**
     * 抽取 Task 注解
     */
    private TaskWrapper taskDescExt(Class clazz) {
        /** 抽取注解*/
        Annotation annotation = ReflectUtil.getTypeAnnotationByName(Task.class, clazz);
        /**  注解类型转换*/
        if (null != annotation) {
            Task task = ReflectUtil.getAnnotationInstance(annotation, Task.class);
            TaskWrapper wrapper = new TaskWrapper();
            wrapper.setName(task.value());
            return wrapper;
        }
        return null;
    }

    /**
     * 抽取 Executor 注解
     *
     * @param method
     * @return
     */
    private ExecutorWrapper executorDescExt(Method method) {
        Annotation annotation = ReflectUtil.getAnnotationFromMethod(Executor.class, method);
        if (null != annotation) {
            Executor executor = ReflectUtil.getAnnotationInstance(annotation, Executor.class);
            ExecutorWrapper wrapper = new ExecutorWrapper();
            wrapper.setValue(executor.value());
            return wrapper;
        }
        return null;
    }

    /**
     * 抽取 Executor 注解
     *
     * @param method
     * @return
     */
    private ExpressionWrapper expressionDescExt(Method method) {
        Annotation annotation = ReflectUtil.getAnnotationFromMethod(Expression.class, method);
        if (null != annotation) {
            Expression expression = ReflectUtil.getAnnotationInstance(annotation, Expression.class);
            ExpressionWrapper wrapper = new ExpressionWrapper();
            wrapper.setStrategy(expression.strategy());
            wrapper.setFactor(expression.factor());
            wrapper.setMeasure(expression.measure());
            return wrapper;
        }
        return null;
    }

    /**
     * 抽取 Join 注解
     *
     * @param method
     * @return
     */
    private JoinWrapper joinDescExt(Method method) {
        Annotation annotation = ReflectUtil.getAnnotationFromMethod(Join.class, method);
        if (null != annotation) {
            Join join = ReflectUtil.getAnnotationInstance(annotation, Join.class);
            JoinWrapper wrapper = new JoinWrapper();
            wrapper.setName(join.value());
            return wrapper;
        }
        return null;
    }

    /**
     * 抽取 Distributed 注解
     *
     * @param method
     * @return
     */
    private DistributedWrapper distributedDescExt(Method method) {
        Annotation annotation = ReflectUtil.getAnnotationFromMethod(Distributed.class, method);
        if (null != annotation) {
            Distributed distributed = ReflectUtil.getAnnotationInstance(annotation, Distributed.class);
            DistributedWrapper wrapper = new DistributedWrapper();
            wrapper.setStrategy(distributed.strategy());
            wrapper.setNumber(distributed.number());
            return wrapper;
        }
        return null;
    }


}
