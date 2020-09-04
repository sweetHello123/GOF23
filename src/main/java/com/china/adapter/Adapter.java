package com.china.adapter;

/**
 * @Author: china wu
 * @Description: 适配器类
 * @Date: 2020/9/4 13:20
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
