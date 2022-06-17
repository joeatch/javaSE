package com.classImprove.interfaces;

public class Test {
    public static void main(String[] args) {
//        理解接口的基本使用，被类实现,一个类可以实现多个接口
        InterfaceImplement inter=new InterfaceImplement("黎明");
        inter.rat();
        inter.run();
        inter.rule();
        inter.method();
        InterfaceDemo.staticMethod();
    }
}
