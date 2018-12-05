package com.workflow.core.service.impl;

import com.workflow.core.context.Context;
import com.workflow.core.entity.ApplyProcessInfo;
import com.workflow.core.proxy.ProxyTest;
import com.workflow.core.service.ProcessService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProcessServiceImpl implements ProcessService {

    private  final Logger LOGGER= LoggerFactory.getLogger(ProcessServiceImpl.class);

    @Override
    public ApplyProcessInfo createWorkflow(Context context) {

        return null;
    }

    @Override
    public ApplyProcessInfo transferWorkflow(Context context) {
        return null;
    }

    @Override
    public ApplyProcessInfo queryWorlFlow(Context context) {
        LOGGER.info("queryWorlFlow:{}",context);
        ApplyProcessInfo info=new ApplyProcessInfo();
        info.setApplicantId("lll");
        return info;
    }
}
