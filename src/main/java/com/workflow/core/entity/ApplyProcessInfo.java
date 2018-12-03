package com.workflow.core.entity;

import java.util.Date;

/**
 * 定义申请记录
 */
public class ApplyProcessInfo {

    /**
     * 申请ID
     */
    private String applyProcessId;

    /**
     * 申请人ID
     */
    private String applicantId;


    /**
     * 审批人ID
     */
    private String approverId;

    /**
     * 流程ID
     */
    private String processId;

    /**
     * 当前阶段
     */
    private String CurrentPhaseId;

    /**
     * 下一阶段
     */
    private String nextPhaseId;

    /**
     * 状态
     */
    private String status;

    /**
     * 流程创建时间
     */
    private Date createTime;

    /**
     * 流程修改时间
     */
    private Date  updateTime;

    /**
     * 备注
     */
    private String remark;

    public String getApplyProcessId() {
        return applyProcessId;
    }

    public void setApplyProcessId(String applyProcessId) {
        this.applyProcessId = applyProcessId;
    }

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public String getApproverId() {
        return approverId;
    }

    public void setApproverId(String approverId) {
        this.approverId = approverId;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getCurrentPhaseId() {
        return CurrentPhaseId;
    }

    public void setCurrentPhaseId(String currentPhaseId) {
        CurrentPhaseId = currentPhaseId;
    }

    public String getNextPhaseId() {
        return nextPhaseId;
    }

    public void setNextPhaseId(String nextPhaseId) {
        this.nextPhaseId = nextPhaseId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
