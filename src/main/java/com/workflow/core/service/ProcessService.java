package com.workflow.core.service;

import com.workflow.core.context.Context;
import com.workflow.core.entity.ApplyProcessInfo;

public interface ProcessService {

    /**
     * 创建工作流
     * @param context
     * @return
     */
    ApplyProcessInfo createWorkflow(Context context);

    /**
     * 工作流扭转
     * @param context
     * @return
     */
    ApplyProcessInfo transferWorkflow(Context context);

    /**
     * 查询工作流
     * @param context
     * @return
     */
    ApplyProcessInfo queryWorlFlow(Context context);

}
