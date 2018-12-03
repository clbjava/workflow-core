package com.workflow.core.services.impl;

import com.workflow.core.context.Context;
import com.workflow.core.services.PhaseService;
import com.workflow.core.services.spi.PhaseSpiService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service("com.workflow.core.services.impl.PhaseServiceImpl")
public class PhaseServiceImpl implements PhaseService<Context, Context> {

    ApplicationContext applicationContext;

    @Override
    public Context execute(final Context context) throws Exception {
        Context result;
        String serviceId = (String) context.get("serviceId");
        PhaseSpiService phaseSpiService = applicationContext.getBean(serviceId, PhaseSpiService.class);
        phaseSpiService.before(context);
        result = (Context) phaseSpiService.execute(context);
        phaseSpiService.after(context);
        return result;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
