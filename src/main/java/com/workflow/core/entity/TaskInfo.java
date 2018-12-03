package com.workflow.core.entity;

/**
 * 定义流程过程阶段任务：注入业务实现
 */
public class TaskInfo {

    /**
     * 流程阶段ID（包含子流程）
     */
    private String phaseId;

    /**
     * 流程阶段任务ID
     */
    private String taskId;

    /**
     * 初始化参数JSON串
     */
    private String initParams;

    /**
     * 流程阶段任务执行
     */
    private String serviceId;

    public String getPhaseId() {
        return phaseId;
    }

    public void setPhaseId(String phaseId) {
        this.phaseId = phaseId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getInitParams() {
        return initParams;
    }

    public void setInitParams(String initParams) {
        this.initParams = initParams;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
}
