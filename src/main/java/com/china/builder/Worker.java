package com.china.builder;

/**
 * @Author: china wu
 * @Description: 具体的建造者
 * @Date: 2020/9/4 11:22
 */
public class Worker extends Builder {

    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    public void step1() {
        product.setA("构建a");
    }

    @Override
    public void step2() {
        product.setB("构建b");
    }

    @Override
    public void step3() {
        product.setC("构建c");
    }

    @Override
    public void step4() {
        product.setD("构建d");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
