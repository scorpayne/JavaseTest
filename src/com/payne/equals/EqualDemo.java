package com.payne.equals;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dengpeng on 2017/7/5.
 */
public class EqualDemo {
    public static void main(String[] args){
//        Integer i1=null; i2=null; i3=null;i4=null;
//        Integer i1=100; i2=100; i3=150;i4=150;
        Integer i1=100,i2 = 100;
        Integer i3=150,i4 = 150;
        System.out.println(i1==i2);//
        System.out.println(i3==i4);//范围在-127至127内的变量直接在常量池中，其他的都是在堆里生成的
    }
}
