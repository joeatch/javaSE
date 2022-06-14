package com.lwq.method;


/*1.方法重载
*同一个类中，出现多个方法名称相同，但是形参列表是不同的，那么这些方法就是重载方法。
*方法重载的作用
*可读性好，方法名称相同提示是同一类型的功能，通过形参不同实现功能差异化的选择，
*这是一种专业的代码设计。
*形参列表不同指的是：形参的个数、类型、顺序不同，不关心形参的名称。
*
*
* 2.return关键字单独使用
* return;    --->    可以立即跳出并结束当前方法的执行。
* */



public class MethodDemo3 {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
    }
//方法重载
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a){
        return a;
    }
}
