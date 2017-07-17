package com.payne.object.executeOrder;

/**
 * Created by dengpeng on 2017/6/23.
 */

/**
 * 执行顺序测试
 * 基本原则：静态代码块 -> 动态代码块 -> 构造函数
 * 静态代码块只在第一次new执行一次，之后不再执行，而非静态代码块在每new一次就执行一次。
 */
public class OrderTest {
    public static int k = 0;
    public static OrderTest t1 = new OrderTest("t1");
    public static OrderTest t2 = new OrderTest("t2");
    public static int i = print("i");
    public static int n = 99;
    private int a = 0;
    public int j = print("j");

    {
        print("构造块");
    }

    static {
        print("静态块");
    }

    public OrderTest(String str) {
        System.out.println((++k) + ":" + str + "    i=" + i + "     n=" + n);
        ++i;
        ++n;
    }

    public static int print(String str) {
        System.out.println((++k) + ":" + str + "    i=" + i + "     n=" + n);
        ++n;
        return ++i;
    }

    public static void main(String args[]) {
        OrderTest t = new OrderTest("init");
    }

    /**
     * 1:i   i=i   n=99
     * 构造块
     * 1:init   i=
     */
}
