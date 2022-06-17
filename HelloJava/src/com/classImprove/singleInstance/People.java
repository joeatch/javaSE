package com.classImprove.singleInstance;

public class People {
//    以前构建一个对象
    public static People p1=new People();
//    私有化构造器
    private People(){
        System.out.println("无参构造器执行了");
    }
}
