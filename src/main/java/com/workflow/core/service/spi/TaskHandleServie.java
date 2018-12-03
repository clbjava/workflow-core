package com.workflow.core.service.spi;

public interface TaskHandleServie<E,T> {

    /**
     * 任务执行
     * @param e
     * @return
     */
    public T run(E e);

}
