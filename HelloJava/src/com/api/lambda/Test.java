package com.api.lambda;

public class Test {
    public static void main(String[] args) {
        /*
        * Lambda表达式的简化格式:
        *   (匿名内部类被重写方法的形参列表) -> {被重写方法的方法体代码。}
            注：-> 是语法形式，无实际含义
        *   注意：Lambda表达式只能简化函数式接口的匿名内部类的写法形式
        什么是函数式接口？
        *   首先必须是接口、其次接口中有且仅有一个抽象方法的形式,常用@founctionalInterface注解（非必须）
         */
        Demo d2=()->{
            System.out.println("beng");
        };
        doing(d2);

    }
    public static void doing(Demo d1){
        d1.run();
    }
}
