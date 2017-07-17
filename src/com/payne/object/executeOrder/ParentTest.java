package com.payne.object.executeOrder;

/**
 * Created by dengpeng on 2017/6/24.
 * <clinit>：在jvm第一次加载class文件时调用，包括静态变量初始化语句和静态块的执行
 * <init>:在实例创建出来的时候调用，包括调用new操作符；调用Class或Java.lang.reflect.Constructor对象的newInstance()方法；调用任何现有对象的clone()方法；通过java.AdapterDemo.ObjectInputStream类的getObject()方法反序列化。
 */
public class ParentTest {
//    private static ParentTest a = new ParentTest();
//    private static ChildTest b = new ChildTest();
    public int size = 5;

    private String say = say();

    private static String say2 = say();

    public ParentTest() {
        System.out.println("父类--构造方法");//2   7
        fun();
    }

    {
        System.out.println("父类--动态代码块");// 1   6
    }


    public void fun(){
        System.out.println("parent.fun()");//3
    }

    static {
        System.out.println("父类--静态代码块");//4
    }

    public static String say(){
        System.out.println("父类--静态方法");//4
        return "hello";
    }


    public static void main(String[] args) {
        new ChildTest();
    }
}

class ChildTest extends ParentTest{
//    private static ChildTest b = new ChildTest();
    public int num = 10;
    private static String str = print("str");

    static {
        System.out.println("子类--静态代码块");// 9
    }
    {
        System.out.println("子类--动态代码块");// 5  10
    }

    public ChildTest() {
        System.out.println("子类--构造方法");// 6   11
        fun();
    }

    public void fun(){
        System.out.println("child.fun()");// 7  8   12
    }

    private static String print(String str){
        System.out.println("子类静态成员变量");// 7  8   12
        return str;
    }
}
