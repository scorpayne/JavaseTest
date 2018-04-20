package com.payne.thread;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorTest {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        ArrayList<Future<String>> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Future<String> result = executor.submit(new Task());
            list.add(result);
        }
        //遍历Future，获取返回值
        for(Future<String> f:list){
            try {
                while(!f.isDone()){System.out.println("执行中，当前线程："+Thread.currentThread().getName()+"；result："+f.get());};
                //阻塞等待获取返回值   如果此时callable线程如果没有执行完get方法会阻塞执行完
                System.out.println(f.get());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}
