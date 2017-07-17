package com.payne.object.inherit;

/**
 * Created by dengpeng on 2017/6/23.
 */
public class Person {
    protected String name = "Person";
    int age;
    private int height;

    public Person() {
        System.out.println("this is a person");
    }

    String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }
}
