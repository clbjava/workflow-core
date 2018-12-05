package com.workflow.core.proxy;

import com.workflow.core.context.Context;
import com.workflow.core.service.ProcessService;
import com.workflow.core.service.impl.ProcessServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Title: workflow-core
 * @Description: TODO
 * @author: Administrator
 * @date: 2018-12-05 11:03
 * @version: V1.0
 */
public class ProxyTest {

    private static final Logger LOG= LoggerFactory.getLogger(ProxyTest.class);

    public static void main(String[] args) {

        try {
            //加上这句将会产生一个$Proxy0.class文件，这个文件即为动态生成的代理类文件
            System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

            Class<?> proxyClass = Proxy.getProxyClass(ProxyTest.class.getClassLoader(),
                    ProcessService.class);
            final Constructor<?> cons = proxyClass.getConstructor(InvocationHandler.class);
            final InvocationHandler invocationHandler = new DefualtInvocationHandler(new ProcessServiceImpl());
            cons.setAccessible(true);
            ProcessService processService = (ProcessService) cons.newInstance(invocationHandler);
            Context context=new Context();
            context.setCode("0000");

            LOG.info("{}",processService.queryWorlFlow(context));

           /* ProcessService processService=(ProcessService)Proxy.
                    newProxyInstance(ProxyTest.class.getClassLoader(),
                            new Class<?>[]{ProcessService.class},
                            new DefualtInvocationHandler(new ProcessServiceImpl()));
           processService.queryWorlFlow(null);*/

        } catch (Throwable e) {
            LOG.info("e----：{}",e);
        }
    }
}
