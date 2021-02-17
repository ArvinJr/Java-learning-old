package com.xonzhi;

/**
 * @author arvin
 * @date 2021/2/17
 * 饿汉式单例
 */
public class Calendar {

    private static final Calendar CALENDAR = new Calendar();

    private Calendar(){}

    public static Calendar getInstance(){
        return CALENDAR;
    }

}
