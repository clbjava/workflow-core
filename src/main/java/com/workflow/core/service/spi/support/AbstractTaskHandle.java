package com.workflow.core.service.spi.support;

import com.workflow.core.context.Context;
import com.workflow.core.service.spi.TaskHandleServie;


abstract class AbstractTaskHandle implements TaskHandleServie<Context,Boolean> {

    @Override
    public Boolean run(Context context){

        return true;
    }
}
