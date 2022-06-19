package com.api.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        Date d1=new Date();
        System.out.println(d1);
        long d2=d1.getTime();
        System.out.println(d2);
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        将日期格式化成日期/时间字符串
        System.out.println(df.format(d1));
//        将时间毫秒值式化成日期/时间字符串
        System.out.println(df.format(d2));
//        解析字符串为日期对象
        System.out.println(df.parse("2022-01-04 12:30:30"));;
    }
}
