package com.china.factory;

/**
 * @Author: china wu
 * @Description: 静态工厂模式
 * @Date: 2020/9/3 20:09
 */
public class SimpleFactoryDemo {
    public static void main(String[] args) {
        Car car = CarFactory.createCar("宝马");
    }
}

class Car {
    private String brandName;

    public Car(String brandName) {
        this.brandName = brandName;
    }
}

class CarFactory {
    public static Car createCar(String brandName) {
        return new Car(brandName);
    }
}
