package com.payne.object.access;

import com.payne.object.inherit.Child;
import com.payne.object.inherit.Person;

/**
 * Created by dengpeng on 2017/6/23.
 */

/**
 * 权限从高到低  public protected  friendly(default) private
 *                自身   同包   子类             外包
 * public          1      1       1               1
 * protected       1      1       1(同包下)       0
 * friendly        1      1       1(同包下)       0
 * private         1      0       0               0
 */
//public class ChildAccessTest {
//    public String grade;
//    public static void main(String[] args){
//        Person p = new Child();
//        System.out.println();
//    }
//}

public class ChildAccessTest extends Person{
/*    public String grade;
    public static void main(String[] args){
        Person p = new Child();
        System.out.println(p.name);//报错，虽然是子类，但是不在同一包下
        System.out.println(p.getAge());//报错，虽然是子类，但是不在同一包下
    }*/
}
