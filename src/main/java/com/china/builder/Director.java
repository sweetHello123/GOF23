package com.china.builder;

/**
 * @Author: china wu
 * @Description: 指挥者
 * @Date: 2020/9/4 11:29
 */
public class Director {

    /**
     * 指挥构造者构建产品
     *
     * @param builder 构造者
     * @return 产品
     */
    public Product build(Builder builder) {
        builder.step1();
        builder.step2();
        builder.step3();
        builder.step4();
        return builder.getProduct();
    }
}
