package com.china.factory;

/**
 * @Author: china wu
 * @Description: 工厂方法模式(可扩展性强)
 * @Date: 2020/9/3 20:36
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {
        Phone phone1 = new IphoneFactory().createPhone();
        phone1.name();

        Phone phone2 = new SumSangFactory().createPhone();
        phone2.name();
    }
}

/**
 * 抽象产品
 */
interface Phone {
    void name();
}

/**
 * 生产产品的抽象工厂
 */
interface PhoneFactory {
    Phone createPhone();
}

/**
 * 具体产品
 */
class Iphone implements Phone {
    @Override
    public void name() {
        System.out.println("生产iphone");
    }
}

/**
 * 生产具体产品的工厂
 */
class IphoneFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new Iphone();
    }
}

class SumSang implements Phone {
    @Override
    public void name() {
        System.out.println("生产三星");
    }
}

class SumSangFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new SumSang();
    }
}
