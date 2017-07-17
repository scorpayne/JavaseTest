package com.payne.designMode.observer;

/**
 * Created by dengpeng on 2017/6/29.
 */
public class ObserverDemo {
    public static void main(String[] args){
        Subject s = new Subject();
        Observer o = new Observer();
        s.addObserver(o);
        s.counter(10);
    }
}
