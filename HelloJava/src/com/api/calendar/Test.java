package com.api.calendar;

import java.util.Calendar;

/*
*
    Calendar代表了系统此刻日期对应的日历对象。
    Calendar是一个抽象类，不能直接创建对象。
*
* */
public class Test {
    public static void main(String[] args) {
        Calendar d1=Calendar.getInstance();
        System.out.println(d1);
        System.out.println(d1.get(Calendar.WEEK_OF_YEAR));
//        可以通过set修改日历，但一般不这么做
        d1.set(Calendar.WEEK_OF_YEAR,25);
        System.out.println(d1.get(Calendar.WEEK_OF_YEAR));
//        为某个字段增加指定的值
        d1.add(Calendar.WEEK_OF_YEAR,2);
        System.out.println(d1.get(Calendar.WEEK_OF_YEAR));
        System.out.println(d1.getTime());
        System.out.println(d1.getTimeInMillis());
    }
}
