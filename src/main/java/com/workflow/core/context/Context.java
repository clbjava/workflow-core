package com.workflow.core.context;


public class Context<T> {

    /**
     * Trading number
     */
    private String transNo;

    /**
     * Trading straregy，not empty
     */
    private String serviceId;

    /**
     * Trading code
     */
    private String code;

    /**
     * Trading msg
     */
    private String msg;

    private T content;

    public Context() {
    }

    public Context(String transNo, String serviceId, String code, String msg) {
        this.transNo = transNo;
        this.serviceId = serviceId;
        this.code = code;
        this.msg = msg;
    }

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}


