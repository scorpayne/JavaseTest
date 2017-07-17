package com.payne.threadLocal;

/**
 * Created by dengpeng on 2017/6/21.
 */
public class SequenceB implements Sequence{
    //线程局部变量，因为局部的变量值，放在一个容器中，不共享，保证了线程安全
    private static ThreadLocal<Integer> numberContainer = new ThreadLocal<Integer>(){

        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    @Override
    public int getNumber() {
        numberContainer.set(numberContainer.get()+1);
        return numberContainer.get();
    }

    public static void main(String[] args){
        Sequence sequenceImpl = new SequenceB();
        ClientThread thread1 = new ClientThread(sequenceImpl);
        ClientThread thread2 = new ClientThread(sequenceImpl);
        ClientThread thread3 = new ClientThread(sequenceImpl);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
