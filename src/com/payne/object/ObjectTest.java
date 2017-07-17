package com.payne.object;

/**
 * Created by dengpeng on 2017/6/23.
 */
public class ObjectTest {
    public static void main(String[] arg){
        A aa = new A();
        aa.setName("tome");

        A bb = aa; //类似于方法传递参数，如果参数是基本类型，则不会变，如果是引用类型，则可以修改引用类型的对象的内容
        bb.setName("jerry");

        System.out.println(aa.getName());
    }

}
