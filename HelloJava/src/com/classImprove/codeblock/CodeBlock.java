package com.classImprove.codeblock;
/*
* 代码块:
*   代码块是类的5大成分之一（成员变量、构造器，方法，代码块，内部类），定义在类中方法外。
    在Java类下，使用 { } 括起来的代码被称为代码块 。
*
* 代码块分为:静态代码块、构造代码块
*   静态代码块：
        格式：static{}
        特点：需要通过static关键字修饰，随着类的加载而加载，并且自动触发、只执行一次
        使用场景：在类加载的时候做一些静态数据初始化的操作，以便后续使用。
    构造代码块：
      格式：{}
      特点：每次创建对象，调用构造器执行时，都会执行该代码块中的代码，并且在构造器执行前执行
      使用场景：初始化实例资源。
* */

import java.util.ArrayList;

/*案例：
*    在启动游戏房间的时候，应该提前准备好54张牌，后续才可以直接使用这些牌数据。
* */
public class CodeBlock {
//    定义一个静态集合，永用来存储牌
    public static ArrayList<String> cards=new ArrayList<>();
    static{
        String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] color={"♠","♥","♣","♦"};
//        组合数字和方块，往集合里面添加
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<color.length;j++){
                String card=numbers[i]+color[j];
                cards.add(card);
            }
        }
        cards.add("大王");
        cards.add("小王");
        System.out.println(cards);
    }




    public static void main(String[] args) {
        System.out.println("main主函数执行了");
    }
}
