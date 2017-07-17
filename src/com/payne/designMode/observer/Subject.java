package com.payne.designMode.observer;


import java.util.Observable;

/**
 * Created by dengpeng on 2017/6/29.
 */
public class Subject extends Observable {

    void counter(int period) {
        for(; period>=0; period-- ) {
            setChanged();
            notifyObservers(new Integer(period));
            try {
                Thread.sleep(100);
            } catch( InterruptedException e) {
                System.out.println("Sleep interrupeted" );
            }
        }
    }
}
