package com.lwq.method;


public class MethodDemo {
    public static void main(String[] args) {
        int a=add(3,4);
        System.out.println(a);

        int b=sumN(3);
        System.out.println(b);

        System.out.println(judgeJO(4));
    }
//    定义一个方法
    public static int add(int a,int b){
        return a+b;
    }
    //定义一个方法，方法中计算出 1-n的和并返回。
    public static int sumN(int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=i;
        }
        return sum;
    }
    //判断是奇数还是偶数
    public static String judgeJO(int n){
        if(n%2==0){
            return n+"为偶数";
        }else{
            return n+"为奇数";
        }

    }
    /*
    * ===方法的参数传递机制====：
    *值传递
    * 在传输实参给方法的形参的时候，并不是传输实参变量本身，
    * 而是传输实参变量中存储的值，这就是值传递。
    *2、基本类型和引用类型的参数在传递的时候有什么不同？
    * 都是值传递。
    * 基本类型的参数传输存储的数据值。
    * 引用类型的参数传输存储的地址值。
    *
    * */
}

