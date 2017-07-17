package com.payne.designMode.observer;

import java.util.Observable;

/**
 * 运用的是java自带的观察者模式
 * Created by dengpeng on 2017/6/29.
 */
public class Observer implements java.util.Observer{
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("update() called, count is:"+((Integer) arg).intValue());
    }
}
