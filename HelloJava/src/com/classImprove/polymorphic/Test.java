package com.classImprove.polymorphic;

public class Test {
    public static void main(String[] args) {
//        多态的形式：父类类型 对象名称=new 子类构建方法；
        Animal a1=new Dog();
        a1.run();//编译看左，运行看右
        System.out.println(a1.name);//变量是编译看左，运行看左

/*
* 多态的优势：
*   组件化解耦。相互之间的依赖性不是那么强
* */
//        所有动物都能够进来比赛
        Dog dog1=new Dog();
        game(dog1);
//        多态不能使用子类的独有方法
//        a1.swim();//报错

//        引用数据类型强制类型转换实现可以使用子类的独有方法
//        强转编译阶段可能不出错，但运行阶段可能出错
        Animal a2=new Dog();
        Dog a3=(Dog) a2;
        a3.swim();
//        判断引用数据类型
        System.out.println(a2 instanceof Dog);

    }
//    对象回调
    public static void game(Animal a){
        System.out.println("游戏开始了");
        a.run();
        System.out.println("游戏结束了");
    }
}
