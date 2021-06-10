package org.apache.rocketmq.example.quickstart;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyDemo {

    private static ThreadLocal local = ThreadLocal.withInitial(() -> "i am local");
    private static ThreadLocal local1 = ThreadLocal.withInitial(() -> "local1");


    static ExecutorService executor = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {

//        Thread.currentThread().get
//        Thread.currentThread();
        /*local.set("userid");
        local.set("name");

        Object o = local1.get();

        System.err.println(o);*/


        executor.execute(() -> {
            int i = 0 / 0;
            System.err.println("ok");
        });


    }


}
