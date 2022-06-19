package com.api.date;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
//        时间类构造器
        Date d1=new Date();
        System.out.println(d1);
        long d2=d1.getTime();
        System.out.println(d2);
        Date d3=new Date(d2);
        System.out.println(d3);
        Date d4=new Date();
        d4.setTime(d2);
        System.out.println(d4);
    }
}
