package com.workflow.core.context;

import java.util.concurrent.ConcurrentHashMap;

public class Context extends ConcurrentHashMap<String,Object> {

    /**
     * Trading number
     */
    private String transNo;

    /**
     * Trading straregy，not empty
     */
    private  String  serviceId;

    /**
     * Trading code
     */
    private  String code;

    /**
     * Trading msg
     */
    private String msg;

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
}


