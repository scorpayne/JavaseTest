package com.payne.threadLocal;

/**
 * Created by dengpeng on 2017/6/21.
 */
public class SequenceA implements Sequence{
    private static int number = 0;

    @Override
    public int getNumber() {
        number = number+1;
        return number;
    }

    public static void main(String[] args){
        Sequence sequenceImpl = new SequenceA();
        ClientThread thread1 = new ClientThread(sequenceImpl);
        ClientThread thread2 = new ClientThread(sequenceImpl);
        ClientThread thread3 = new ClientThread(sequenceImpl);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
