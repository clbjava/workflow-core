package com.workflow.core.entity;

/**
 * 定义流程过程阶段
 */
public class PhaseInfo {

    /**
     * 流程ID
     */
    private String processId;

    /**
     * 流程阶段ID
     */
    private String phaseId;

    /**
     * 初始化参数JSON串
     */
    private String initParams;

    /**
     * 流程阶段任务执行
     */
    private String serviceId;

    private TaskInfo taskInfo;

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getPhaseId() {
        return phaseId;
    }

    public void setPhaseId(String phaseId) {
        this.phaseId = phaseId;
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

    public TaskInfo getTaskInfo() {
        return taskInfo;
    }

    public void setTaskInfo(TaskInfo taskInfo) {
        this.taskInfo = taskInfo;
    }
}
