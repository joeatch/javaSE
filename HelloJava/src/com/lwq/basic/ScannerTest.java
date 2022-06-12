package com.lwq.basic;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        //得到一个键盘扫描器对象
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的年龄");
        //调用sc对象的功能
        int age=sc.nextInt();
        System.out.println("请输入您的名称");
        String name=sc.next();
        System.out.println("您的姓名为"+name);
        System.out.println("您的年龄为"+age);


    }
}
