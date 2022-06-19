package com.api.localdateandtime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

//LocalDate、LocalTime、LocalDateTime
//分别表示日期，时间，日期时间对象，他们的类的实例是不可变的对象。
public class Test {
    public static void main(String[] args) {
        LocalTime lt= LocalTime.now();
        System.out.println(lt);
        LocalDate ld=LocalDate.now();
        System.out.println(ld);
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
        LocalDate localDate1 = LocalDate.of(2099 , 11,11);
        LocalTime localTime1 = LocalTime.of(11, 11, 11);
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 10, 6, 13, 23, 43);
        System.out.println(localDate1);
        System.out.println(localTime1);
        System.out.println(localDateTime1);
//        geYear()
        System.out.println(ldt.getYear());
//        getMonthValue()
        System.out.println(ldt.getMonthValue());
//        getDayOfMonth()
        System.out.println(ldt.getDayOfMonth());
//        getDayOfYear()
        System.out.println(ldt.getDayOfYear());
//        getDayOfWeek()
        System.out.println(ldt.getDayOfWeek());
//        LocalDateTime可以转化为LocalDate或者LocalTime
        System.out.println(ldt.toLocalDate());
        System.out.println(ldt.toLocalTime());


        /*
        * 时间戳
        * */
        Instant instant = Instant.now();
        System.out.println("当前时间戳是：" + instant);
        Date date = Date.from(instant);
        System.out.println("当前时间戳是：" + date);
        instant = date.toInstant();
        System.out.println(instant);

        /*
        * DateTimeFormatter
        * */
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String ldtStr = ldt.format(dtf);
        System.out.println(ldtStr);//2021-03-01 15:09:17
        String ldtStr1 = dtf.format(ldt);
        System.out.println(ldtStr1);//2021-03-01 15:09:17

        /*
        * Duration/Period
         */
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate birthDate = LocalDate.of(1995, 1, 11);
        System.out.println(birthDate); // 1995-01-11
        Period period = Period.between(birthDate, today);
        System.out.printf("年龄 : %d 年 %d 月 %d 日", period.getYears(), period.getMonths(), period.getDays());
        LocalDate birthDate1 = LocalDate.of(1995, 1, 11);
        System.out.println(birthDate1); // 1995-01-11
        Period period2 = Period.between(birthDate, today);
        System.out.printf("年龄 : %d 年 %d 月 %d 日", period2.getYears(), period2.getMonths(), period2.getDays());
        /*
        * 计算时间间隔差异：java.time.Duration
        *   1、 Duration:  用于计算两个“时间”间隔。
            2、 Period:      用于计算两个“日期”间隔。
        * */
        LocalDateTime today2 = LocalDateTime.now();
        System.out.println(today2);
        LocalDateTime birthDate3 = LocalDateTime.of(1990,10,1,10,50,30);
        System.out.println(birthDate3);
        Duration duration = Duration.between(birthDate3, today2);//第二个参数减第一个参数
        System.out.println(duration.toDays());//两个时间差的天数
        System.out.println(duration.toHours());//两个时间差的小时数
        System.out.println(duration.toMinutes());//两个时间差的分钟数
        System.out.println(duration.toMillis());//两个时间差的毫秒数
        System.out.println(duration.toNanos());//两个时间差的纳秒数

//        ChronoUnit类可用于在单个时间单位内测量一段时间，这个工具类是最全的了，可以用于比较所有的时间单位
        System.out.println("相差的年数：" + ChronoUnit.YEARS.between(birthDate3, today2));
    }
}
