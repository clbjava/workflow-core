package com.workflow.core.services.spi.support;

import com.workflow.core.context.Context;
import com.workflow.core.services.spi.PhaseSpiService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

public class DefualtPhaseSupport implements PhaseSpiService<Context, Context> {

    ApplicationContext applicationContext;

    @Override
    public void before(Context context) throws Exception {

    }

    @Override
    public Context execute(Context context) throws Exception {
        String string=new String();

        return null;
    }

    @Override
    public void after(Context context) throws Exception {
        //执行任务 TaskSpiServie.run()

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
