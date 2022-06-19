package com.api.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 某购物网站举办秒杀活动，开始时间和结束时间为：
*   开始时间：2020年11月11日 0:00:00
*   结束时间：2020年11月11日 0:10:00
*
* ，当前活动结束后，系统记录到2位用户的付款时间分别如下：
    小贾下单并付款的时间为：2020年11月11日 0:03:47
    小皮下单并付款的时间为：2020年11月11日 0:10:11
规则：顾客的付款时间必须在秒杀时间之内，请判断出两位顾客是否秒杀成功*/
public class Demo {
    public static void main(String[] args) throws ParseException {
        String start="2020年11月11日 0:00:00";
        String end="2020年11月11日 0:10:00";
        String xiaojia="2020年11月11日 0:03:47";
        String xiaopi="2020年11月11日 0:10:11";
//        把4个字符串形式的时间解析成日期对象。
        SimpleDateFormat df=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startf=new Date();
        Date endf=new Date();
        Date xiaojiaf=new Date();
        Date xiaopif=new Date();
        startf=df.parse(start);
        endf=df.parse(end);
        xiaojiaf=df.parse(xiaojia);
        xiaopif=df.parse(xiaopi);
        System.out.println();
//        判断小贾和小皮的时间是否在秒杀时间范围之内，并给出相应的提示。
        if(xiaojiaf.after(startf)&&xiaojiaf.before(endf)){
            System.out.println("小贾秒杀成功了");
        }else{
            System.out.println("小贾秒杀失败了");
        };
        if(xiaopif.after(startf)&&xiaopif.before(endf)){
            System.out.println("小皮秒杀成功了");
        }else{
            System.out.println("小皮秒杀失败了");
        }


    }
}
