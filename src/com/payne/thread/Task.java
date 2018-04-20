package com.payne.thread;

import java.util.Random;
import java.util.concurrent.Callable;

public class Task implements Callable<String> {

    @Override
    public String call() throws Exception {
        // TODO Auto-generated method stub
        Random random=new Random();
        int result=random.nextInt(100);
        // 第二阶段——等待所有选手准备好
        long l = (random.nextInt(5) * 1000);
        Thread.sleep(l);
        System.out.println("等待："+l/1000+"秒");
        return Thread.currentThread().getName()+":"+result;
    }
}
