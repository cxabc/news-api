package com.maidao.edu.news.springbootdemo.common.model;

import java.util.Calendar;

/**
 * 创建人:chenpeng
 * 创建时间:2019-08-05 10:09
 * Version 1.8.0_211
 * 项目名称：news
 * 类名称:TimeUnit
 * 类描述:TODO
 **/
public enum TimeUnit {
    YEAR("Y", Calendar.YEAR), MONTH("M", Calendar.MONTH), WEEK("W", Calendar.WEEK_OF_YEAR), DAY("D",
            Calendar.DAY_OF_MONTH), HOUR("H",
            Calendar.HOUR_OF_DAY), MINUTE("I", Calendar.MINUTE), SECOND("S", Calendar.SECOND);

    private String value;
    private int calendarUnit;

    private TimeUnit(String value, int calendarUnit) {
        this.value = value;
        this.calendarUnit = calendarUnit;
    }

    public static TimeUnit find(String value) {
        for (TimeUnit item : TimeUnit.values()) {
            if (item.value.equals(value)) {
                return item;
            }
        }
        return null;
    }

    public String getValue() {
        return value;
    }

    public int getCalendarUnit() {
        return calendarUnit;
    }

}
