package com.demo8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test8 implements Runnable
{
    private final String name;

    public Test8(String name) {
        this.name = name;
    }

    @Override
    public void run()
    {
        System.out.println("start task " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("end task " + name);
    }

    public static void main(String[] args)
    {
        // 创建一个固定大小的线程池:
        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 6; i++) {
            es.submit(new Test8("" + i));
        }
        // 关闭线程池:
        es.shutdown();
    }
}
