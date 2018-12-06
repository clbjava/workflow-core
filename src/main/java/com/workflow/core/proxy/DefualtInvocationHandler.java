package com.workflow.core.proxy;

import com.workflow.core.service.ProcessService;
import com.workflow.core.service.impl.ProcessServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Title: workflow-core
 * @Description:
 * @author: Administrator
 * @date: 2018-12-05 10:44
 * @version: V1.0
 */
public class DefualtInvocationHandler implements DefualtProxy, InvocationHandler {

    private final Logger LOGGER= LoggerFactory.getLogger(DefualtInvocationHandler.class);

    //cache
    private final Map<String,Object> cache=new ConcurrentHashMap<String,Object>();

    private Object target;

    private Class<?>[] proxiedInterfaces;

    public DefualtInvocationHandler(Object target,Class<?>[] proxiedInterfaces ) {
        LOGGER.info(">>>>>>init:{}",target.getClass().getName());
        cache.put(target.getClass().getName(),target);
        this.target = target;
        this.proxiedInterfaces=proxiedInterfaces;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        LOGGER.info("proxy：{}，method：{}，args：{}",proxy,method,args);
        Object object=null;
        //before
        LOGGER.info(">>>>>>before:");

        method.setAccessible(true);

        LOGGER.info(">>>>>> get :{}",proxy.getClass());

        //测试用
        object= method.invoke(cache.get(target.getClass().getName()),args);

        //method.invoke((ProcessService)proxy,args);

        //after
        LOGGER.info(">>>>>>after:");
        return object;
    }

    @Override
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                proxiedInterfaces,
                this);
    }


}
