package com.classImprove.interfaces;
/*
*接口：
*   接口是一种==规范==；
* 接口中可以包含：
*   常量
*   抽象方法
* 接口一定是公开的，因此public可以不写
* */
public interface InterfaceDemo {
//    常量（常量一定需要初始化）
    public static final String SCHOOL_NAME="WIT";
    String SCHOOL_NAME1="WIT";
//    抽象方法
    public abstract void run();
    void rat();
//    默认方法，用default修饰
    default void method(){
        System.out.println("默认方法执行了");
    }
//    接口的静态方法（通过接口名调用）
    static void staticMethod(){
        System.out.println("静态方法执行了");
    }
//    私有方法（jdk9才开始有）
}
