package com.workflow.core.services.spi.support;

import com.workflow.core.context.Context;
import com.workflow.core.services.spi.TaskHandleServie;
import org.springframework.stereotype.Service;

@Service("com.workflow.core.services.spi.support.DefualtTaskHandleSupport")
public class DefualtTaskHandleSupport implements TaskHandleServie<Context,Boolean> {

    public Boolean run(Context context){

       return true;
    }

}
