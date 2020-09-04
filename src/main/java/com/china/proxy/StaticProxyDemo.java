package com.china.proxy;

/**
 * @Author: china wu
 * @Description: 静态代理模式
 * @Date: 2020/9/4 14:45
 */
public class StaticProxyDemo {
    public static void main(String[] args) {
        // 创建代理对象，并传入真实对象
        Proxy proxy = new Proxy(new Real());
        proxy.todo();
    }
}

/**
 * 目标接口
 */
interface Target {
    void todo();
}

/**
 * 真实角色对目标接口的实现
 */
class Real implements Target {
    @Override
    public void todo() {
        System.out.println("Real to do");
    }
}

/**
 * 代理角色对目标接口的实现
 */
class Proxy implements Target {

    /**
     * 目标角色的引用
     */
    private Target target;

    public Proxy(Target target) {
        this.target = target;
    }

    @Override
    public void todo() {
        doBefore();
        target.todo();
        doAfter();
    }

    /**
     * 代理角色执行工作前
     */
    private void doBefore() {
        System.out.println("准备工作");
    }

    /**
     * 代理角色执行工作后
     */
    private void doAfter() {
        System.out.println("收尾工作");
    }
}
