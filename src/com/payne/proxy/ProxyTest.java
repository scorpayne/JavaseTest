/**
 * Chengzai.com Inc. 
 * Copyright (c) 2016-2017 All Rights Reserved. 
 */
package com.payne.proxy;

import com.payne.interfaces.HelloWorldService;

/**
 *
 * @author peng.dengp
 * @version $Id: ProxyTest, v 0.1 2017-09-14 11:27 peng.dengp Exp $
 */
public class ProxyTest {
    public static void main(String[] args){
        HelloWorldService helloWorldService = (HelloWorldService)PRCProxyClient.getProxy(HelloWorldService.class);
        helloWorldService.sayHello("test");
    }
}
