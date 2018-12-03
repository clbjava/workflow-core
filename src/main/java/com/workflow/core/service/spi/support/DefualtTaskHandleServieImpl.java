package com.workflow.core.service.spi.support;

import com.workflow.core.context.Context;
import org.springframework.stereotype.Service;

@Service("com.workflow.core.service.spi.support.DefualtTaskHandleServieImpl")
public class DefualtTaskHandleServieImpl extends AbstractTaskHandle {

    public Boolean run(Context context){

       return true;
    }

}
