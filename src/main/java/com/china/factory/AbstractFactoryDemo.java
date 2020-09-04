package com.china.factory;

/**
 * @Author: china wu
 * @Description: 抽象工厂模式
 * @Date: 2020/9/3 21:18
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        System.out.println("=======小米产品=======");
        ComputerProduct computerProduct = new XiaoMiFactory().createComputerProduct();
        computerProduct.playGames();

        TvProduct tvProduct = new XiaoMiFactory().createTvProduct();
        tvProduct.watch();

        System.out.println("======华为产品======");
        ComputerProduct computerProduct1 = new HuaWeiFactory().createComputerProduct();
        computerProduct1.watchFilm();

        TvProduct tvProduct1 = new HuaWeiFactory().createTvProduct();
        tvProduct1.watch();
    }
}

/**
 * 抽象的产品工厂
 */
interface ProductFactory {
    ComputerProduct createComputerProduct();

    TvProduct createTvProduct();
}

/**
 * 具体的产品工厂
 */
class XiaoMiFactory implements ProductFactory {
    @Override
    public ComputerProduct createComputerProduct() {
        return new XiaoMiComputer();
    }

    @Override
    public TvProduct createTvProduct() {
        return new XiaoMiTv();
    }
}

class HuaWeiFactory implements ProductFactory{
    @Override
    public ComputerProduct createComputerProduct() {
        return new HuaWeiComputer();
    }

    @Override
    public TvProduct createTvProduct() {
        return new HuaWeiTv();
    }
}

/**
 * 某种抽象产品
 */
interface ComputerProduct {
    void playGames();

    void watchFilm();
}

/**
 * 某种抽象产品
 */
interface TvProduct {
    void open();

    void watch();
}

/**
 * 具体产品实现
 */
class XiaoMiComputer implements ComputerProduct {
    @Override
    public void playGames() {
        System.out.println("小米电脑玩游戏");
    }

    @Override
    public void watchFilm() {
        System.out.println("小米电脑看电影");
    }
}

class XiaoMiTv implements TvProduct {
    @Override
    public void open() {
        System.out.println("打开小米电视");
    }

    @Override
    public void watch() {
        System.out.println("观看小米电视");
    }
}

class HuaWeiComputer implements ComputerProduct {
    @Override
    public void playGames() {
        System.out.println("华为电脑玩游戏");
    }

    @Override
    public void watchFilm() {
        System.out.println("华为电脑看电影");
    }
}

class HuaWeiTv implements TvProduct {
    @Override
    public void open() {
        System.out.println("打开华为电视");
    }

    @Override
    public void watch() {
        System.out.println("观看华为电视");
    }
}