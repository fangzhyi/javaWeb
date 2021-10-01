package com.threadlocal;

import java.util.Hashtable;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ThreadLocalTest {
//    public static Map<String,Object> data = new Hashtable<String,Object>();
    private static Random random = new Random();
    public static ThreadLocal<Object> threadLocal = new ThreadLocal<Object>();

    public static class Task implements Runnable{
        @Override
        public void run() {

            int i = random.nextInt(1000);

            String name = Thread.currentThread().getName();//获取当前线程名

            System.out.println("线程【"+name+"】生成的随机数是："+i);

//            data.put(name,i);
            threadLocal.set(i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            new OrderService().createOrder();

//            Object o = data.get(name);
            Object o = threadLocal.get();
            System.out.println("在线程【"+name+"】快结束时取出关联的数据是"+o);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(new Task()).start();
        }
    }
}
