package com.workflow.core.services.spi;

public interface TaskHandleServie<E,T> {

    /**
     * 任务执行
     * @param e
     * @return
     */
    public T run(E e);

}
