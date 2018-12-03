package com.workflow.core.services.spi;


import org.springframework.context.ApplicationContextAware;

public interface  PhaseSpiService<E, T>  extends ApplicationContextAware {

    /**
     * 流程阶段前处理
     *
     * @param e
     */
    public  void before(E e) throws Exception;

    /**
     * 流程阶段处理
     *
     * @param e
     * @return
     */
    public  T execute(E e) throws Exception;


    /**
     * 流程阶段后处理
     *
     * @param e
     */
    public  void after(E e) throws Exception;

}
