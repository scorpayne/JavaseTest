/**
 * Chengzai.com Inc. 
 * Copyright (c) 2016-2017 All Rights Reserved. 
 */
package com.payne.natives;

/**
 *
 * @author peng.dengp
 * @version $Id: HelloNative, v 0.1 2017-09-19 16:00 peng.dengp Exp $
 */
public class HelloNative extends Object{
    static
    {
        System.loadLibrary("HelloNative");
    }

    /**
     * native 关键字告诉编译器（其实是JVM）调用的是该方法在外部定义，这里指的是C。如果大家直接运行这个代码， JVM会告之：“A Java Exception has occurred.”
     */
    public static native void sayHello();

    @SuppressWarnings("static-access")
    public static void main(String[] args)
    {
        new HelloNative().sayHello();
    }

}
