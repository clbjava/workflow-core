package com.workflow.core.entity;

import java.util.List;

/**
 * 定义流程
 */
public class ProcessInfo {

    /**
     * 流程ID
     */
    private String processId;

    /**
     * 流程描述
     */
    private String processDesc;

    /**
     * 流程阶段
     */
    private List<PhaseInfo> phaseInfos;

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getProcessDesc() {
        return processDesc;
    }

    public void setProcessDesc(String processDesc) {
        this.processDesc = processDesc;
    }

    public List<PhaseInfo> getPhaseInfos() {
        return phaseInfos;
    }

    public void setPhaseInfos(List<PhaseInfo> phaseInfos) {
        this.phaseInfos = phaseInfos;
    }
}
