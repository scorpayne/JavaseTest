package com.payne.threadLocal;

/**
 * Created by dengpeng on 2017/6/22.
 */
public class SequenceC implements Sequence{
    private static MyThreadLocal<Integer> numberContainer = new MyThreadLocal<Integer>(){

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
        Sequence sequenceImpl = new SequenceC();
        ClientThread thread1 = new ClientThread(sequenceImpl);
        ClientThread thread2 = new ClientThread(sequenceImpl);
        ClientThread thread3 = new ClientThread(sequenceImpl);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
