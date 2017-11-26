/**
 * Chengzai.com Inc. 
 * Copyright (c) 2016-2017 All Rights Reserved. 
 */
package com.payne.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * @author peng.dengp
 * @version $Id: PRCProxyClient, v 0.1 2017-09-14 11:22 peng.dengp Exp $
 */
public class PRCProxyClient implements InvocationHandler{
    private Object obj;
    public PRCProxyClient(Object obj){
        this.obj = obj;
    }

    /**
     * 得到被代理对象
     * @param obj
     * @return
     */
    public static Object getProxy(Object obj){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),new PRCProxyClient(obj));
    }

    /**
     * 调用此方法执行
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = new Object();
        // ...执行通信相关逻辑
        // ...
        System.out.print("1111");
        return result;
    }
}
