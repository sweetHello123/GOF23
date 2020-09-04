package com.china.adapter;

/**
 * @Author: china wu
 * @Description: 适配器模式
 * @Date: 2020/9/4 13:49
 */
public class AdapterDemo {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        adapter.request();
    }
}
