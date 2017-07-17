package com.payne.object.inherit;

/**
 * Created by dengpeng on 2017/6/23.
 */
public class Child extends Person {
    public String grade;//年级
    public static String hobby;//年级

    public Child() {
        System.out.println("this is a child");
//        super();//super must be first statement in constructor body
    }

    public static String getHobby(){
        return hobby;
    }

    public static void main(String[] args){
        Child c = new Child();
//        System.out.println(this.hobby);//静态方法中，不能引用this，因为根据不知道这个this指向哪个对象。
//        System.out.println(c.height);   //报错，因为父类height是私有的
    }
}
