package com.china.singleton;

/**
 * @Author: china wu
 * @Description: 懒汉式单例模式
 * @Date: 2020/9/3 13:18
 */
public class LazySingletonDemo {

    private LazySingletonDemo() {
        System.out.println(Thread.currentThread().getName() + "私有构造");
    }


    public static LazySingletonDemo getInstance() {
        if (instance == null) {
            synchronized (LazySingletonDemo.class) {
                if (instance == null) {
                    instance = new LazySingletonDemo();
                }
            }
        }
        return instance;
    }

    private volatile static LazySingletonDemo instance;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                LazySingletonDemo.getInstance();
            }, String.valueOf(i)).start();
        }
    }
}
