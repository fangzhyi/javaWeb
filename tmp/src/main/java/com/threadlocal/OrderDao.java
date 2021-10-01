package com.threadlocal;

public class OrderDao {
    public void savaOrder(){
        String name = Thread.currentThread().getName();
//        System.out.println("savaOrder 当前线程["+name+"]中保存的数据是："+ThreadLocalTest.data.get(name));
        System.out.println("savaOrder 当前线程["+name+"]中保存的数据是："+ThreadLocalTest.threadLocal.get());
    }
}
