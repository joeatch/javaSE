package com.classImprove.innerclass;

public class AnonymousInnerClass {
//    匿名内部类，作用：方便创建子类对象，最终目的是为了简化代码编写。

    public static void main(String[] args) {
        swim(new Swimming() {
            @Override
            public void swim() {
                System.out.println("a在游泳");
            }
        });
        Swimming a=new Swimming() {
            @Override
            public void swim() {
                System.out.println("b在游泳");
            }
        };
        swim(a);
    }
    public static void swim(Swimming s){
        s.swim();
    }

}
