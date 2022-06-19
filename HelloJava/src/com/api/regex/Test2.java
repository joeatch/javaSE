package com.api.regex;

import java.util.Scanner;

/*
* 字符串对象提供了匹配正则表达式的方法
    public boolean matches (String regex): 判断是否匹配正则表达式，匹配返回true，不匹配返回false。
    * 1.字符类，默认只匹配一个字符
        [abc]	       只能是a, b, 或c
        [^abc]	       除了a, b, c之外的任何字符
        [a-zA-Z]               a到z A到Z，包括（范围）
        [a-d[m-p]]	       a到d，或m通过p：（[a-dm-p]联合）
        [a-z&&[def]]	       d, e, 或f(交集)
        [a-z&&[^bc]]	       a到z，除了b和c：（[ad-z]减法）
    * 2.预定义的字符类(默认匹配一个字符)
         .	任何字符
        \d	一个数字： [0-9]
        \D	非数字： [^0-9]
        \s	一个空白字符： [ \t\n\x0B\f\r]
        \S	非空白字符： [^\s]
        \w	[a-zA-Z_0-9] 英文、数字、下划线
        \W	 [^\w] 一个非单词字符
    3.贪婪的量词（配合匹配多个字符
        X?	X , 一次或根本不
        X*	X，零次或多次
        X+	X , 一次或多次
        X {n}	X，正好n次
        X {n, }	X，至少n次
        X {n,m}	X，至少n但不超过m次

    * */
public class Test2 {
    public static void main(String[] args) {
//接收用户输入的数据（如邮箱），使用正则表达式完成检验，并给出提示。
//        邮箱的常见格式为****@****.com.cn,****@****.com
        checkMail();
    }
    public static void checkMail(){
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("请输入您的邮箱");
            String mail= sc.next();
            if(mail.matches("\\w{4,20}@\\w{1,4}\\.\\w{0,4}")){
                System.out.println("邮箱格式正确");
                break;
            }else{
                System.out.println("邮箱格式错误");
            }
        }
    }
}
