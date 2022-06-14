package com.calss.api;

import java.util.Scanner;

public class ApiStringTest2 {
    public static void main(String[] args) {
//        键盘录入一个手机号，将中间四位号码屏蔽
//        截取字符串前三位、后四位,将前三位 连接“****”然后继续连接后四位，输出最终结果即可
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入手机号");
        String tel=sc.next();
        System.out.println("加密之后的手机号为");
        String telk=tel.substring(0,3).concat("****").concat(tel.substring(7));
        System.out.println(telk);
    }
}
