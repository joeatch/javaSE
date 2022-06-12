package com.lwq.basic;

public class OperatorTest2 {
    public static void main(String[] args) {
        {
            System.out.println("------三元运算符案例--------");
            /*
            * 定义三个整数，找出最大值并打印在控制台*/
            int a=100,b=70,c=60;
            int res=a>b?a:b;
            int res1=res>c?res:c;
            System.out.println(res1);
            System.out.println("----案例优化-----");
            int resMax=a>b?(a>c?a:c):(b>c?b:c);
            System.out.println(resMax);
        }
        {
            System.out.println("-------运算符优先级-------");
            /*优先级如下：
            0：（）
            1： ！、取反、++，--
            2.  *、/、%
            3.  +、-
            4.  <<、>>、>>>
            * */
        }
    }
}
