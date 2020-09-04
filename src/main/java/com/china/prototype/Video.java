package com.china.prototype;

import java.util.Date;

/**
 * @Author: china wu
 * @Description:
 * @Date: 2020/9/4 12:30
 */
public class Video implements Cloneable{

    String name;

    Date createTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        Video video = (Video) clone;
        // 深度克隆属性
        video.createTime = (Date) this.createTime.clone();
        return clone;
    }

    public Video() {
    }

    public Video(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
