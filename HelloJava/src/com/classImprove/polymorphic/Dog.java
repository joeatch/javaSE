package com.classImprove.polymorphic;

public class Dog extends Animal{
    public String name="子类狗";
    @Override
    public void run() {
        System.out.println("狗跑的比较快");
    }
    public void swim(){
        System.out.println("狗可以游泳");
    }
}
