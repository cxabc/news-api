package com.maidao.edu.news.springbootdemo.api.banner.entity;

/**
 * 创建人:chenpeng
 * 创建时间:2019-08-05 10:05
 * Version 1.8.0_211
 * 项目名称：news
 * 类名称:BannerType
 * 类描述:Banner类型枚举
 **/
public enum BannerType {

    HOME_PC(1, "PC首页"), HOME_WX(2, "微信首页"),
    JAVA_PRY_PC(3, "PC Java就业班"), JAVA_PRY_WX(4, "微信 Java就业班"),
    JAVA_ADV_PC(5, "PC Java高阶班"), JAVA_ADV_WX(6, "微信 Java高阶班"),
    SERVICE_PC(7, "PC 教学服务"), SERVICE_WX(8, "微信 教学服务"),
    REACT_PC(9, "PC React"), REACT_WX(10, "微信 React"),
    ABOUT_PC(11, "PC 关于"), ABOUT_WX(12, "微信 关于");

    private int key;
    private String val;

    BannerType(int key, String val) {
        this.setKey(key);
        this.setVal(val);
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
