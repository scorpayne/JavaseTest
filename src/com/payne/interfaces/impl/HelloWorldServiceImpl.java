/**
 * Chengzai.com Inc. 
 * Copyright (c) 2016-2017 All Rights Reserved. 
 */
package com.payne.interfaces.impl;

import com.payne.interfaces.HelloWorldService;

/**
 *
 * @author peng.dengp
 * @version $Id: HelloWorldServiceImpl, v 0.1 2017-09-14 11:32 peng.dengp Exp $
 */
public class HelloWorldServiceImpl implements HelloWorldService{
    @Override public String sayHello(String msg) {
        String result = "hello world " + msg;
        System.out.println(result);
        return result;
    }
}
