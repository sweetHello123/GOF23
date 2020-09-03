package com.china.singleton;

/**
 * @Author: china wu
 * @Description: 饿汉式单例模式
 * @Date: 2020/9/3 13:13
 */
public class HungrySingletonDemo {

    private Byte[] bytes = new Byte[1024];

    private HungrySingletonDemo() {
        System.out.println(Thread.currentThread().getName() + "线程的私有构造");
    }

    private static HungrySingletonDemo instance = new HungrySingletonDemo();

    public static HungrySingletonDemo getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        HungrySingletonDemo instance1 = HungrySingletonDemo.getInstance();
        HungrySingletonDemo instance2 = HungrySingletonDemo.getInstance();
        System.out.println(instance1 == instance2);

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                HungrySingletonDemo instance = HungrySingletonDemo.getInstance();
            }, String.valueOf(i)).start();
        }
    }
}
