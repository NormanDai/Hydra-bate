package com.hydra.parsers;


import com.hydra.core.JobDetail;
import com.hydra.core.JobDescription;

import java.util.List;

public interface JobDescriptionParser {

    /**
     * 解析作业描述
     * @param description
     * @return
     */
    List<JobDetail> parse(JobDescription description);
}
