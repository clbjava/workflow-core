package com.workflow.core.service;


import org.springframework.context.ApplicationContextAware;

public interface PhaseService<E, T>  extends ApplicationContextAware {

    /**
     * 流程流转处理
     * @param e
     * @return
     * @throws Exception
     */
    public T execute(E e) throws Exception;

}
