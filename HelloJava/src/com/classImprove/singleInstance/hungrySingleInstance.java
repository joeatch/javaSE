package com.classImprove.singleInstance;
//单例设计模式：可以保证系统中，应用该模式的这个类永远只有一个实例，即一个类永远只能创建一个对象。
public class hungrySingleInstance {
//    饿汉单例设计模式
//          在用类获取对象的时候，对象已经提前为你创建好了。
    public static void main(String[] args) {
        People p1=People.p1;
        People p2=People.p1;
        System.out.println(p1==p2);
    }

}
