package com.classImprove.singleInstance;

public class LazySingleInstance {
//    懒汉单例的设计模式
//          1.私有化构造函数
//          2。定义一个静态成员变量负责存储一个对象
//          3.提供一个方法，对外返回单例对象
public static void main(String[] args) {
    People2 p1=People2.getInstance();
    People2 p2=People2.getInstance();
    System.out.println(p1==p2);
}


}
