package com.workflow.core.services.spi;

public interface TaskSpiServie<E,T> {

    /**
     * 任务执行
     * @param e
     * @return
     */
    public T run(E e);

}
