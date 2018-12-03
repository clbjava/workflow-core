package com.workflow.core.services.spi.support;

import com.workflow.core.context.Context;
import com.workflow.core.services.spi.TaskSpiServie;
import org.springframework.stereotype.Service;

@Service("com.workflow.core.services.spi.support.DefualtTaskSupport")
public class DefualtTaskSupport implements TaskSpiServie<Context,Boolean> {

    public Boolean run(Context context){

       return true;
    }

}
