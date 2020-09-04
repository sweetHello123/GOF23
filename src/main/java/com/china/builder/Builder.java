package com.china.builder;

/**
 * @Author: china wu
 * @Description: 抽象的建造者
 * @Date: 2020/9/4 11:05
 */
public abstract class Builder {

    public abstract void step1();

    public abstract void step2();

    public abstract void step3();

    public abstract void step4();

    abstract Product getProduct();
}
