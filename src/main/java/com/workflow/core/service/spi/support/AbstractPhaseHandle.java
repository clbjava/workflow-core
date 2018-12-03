package com.workflow.core.service.spi.support;


import com.workflow.core.context.Context;
import com.workflow.core.service.spi.PhaseHandleService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;


abstract class AbstractPhaseHandle implements PhaseHandleService<Context, Context> {

    ApplicationContext applicationContext;

    @Override
    public void before(Context context) throws Exception {
        return;
    }

    @Override
    public Context execute(Context context) throws Exception {
        String string = new String();


        return null;
    }

    @Override
    public void after(Context context) throws Exception {
        //执行任务 TaskHandleServie.run()
        return;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
