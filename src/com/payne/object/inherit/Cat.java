package com.payne.object.inherit;

/**
 * Created by dengpeng on 2017/6/23.
 */
public class Cat {

    public static void main(String[] args){
        Person person = new Person();
        System.out.println("调用default成员变量"+person.age);
        System.out.println("调用default方法"+person.getName());
    }


}
