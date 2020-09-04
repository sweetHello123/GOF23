package com.china.prototype;

import java.util.Date;

/**
 * @Author: china wu
 * @Description: 原型模式
 * @Date: 2020/9/4 12:28
 */
public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video video = new Video("annie", date);
        System.out.println("video=" + video + ",hashCode=" + video.hashCode());

        // 克隆一个Video对象
        Video clone = (Video) video.clone();
        System.out.println("clone=" + clone + ",hashCode=" + clone.hashCode());

        // 改变日期值
        date.setTime(1232334);

        System.out.println("video=" + video);
        System.out.println("clone=" + clone);
    }
}
