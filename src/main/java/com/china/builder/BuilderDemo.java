package com.china.builder;

/**
 * @Author: china wu
 * @Description: 建造者模式
 * @Date: 2020/9/4 11:35
 */
public class BuilderDemo {
    public static void main(String[] args) {
        // 使用指挥者构建
        Director director = new Director();
        Product product = director.build(new Worker());
        System.out.println(product);
    }
}
