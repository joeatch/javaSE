package com.lwq.test;

/*
* 案例2：找素数
*除了1和它本身以外，不能被其他正整数整除，就叫素数。
*101-200之间的数据可以采用循环依次拿到; 每拿到一个数，判断该数是否是素数。
* 判断规则是：从2开始遍历到该数的一半的数据，看是否有数据可以整除它，有则不是素数，没有则是素数。
* */

public class TestDemo2 {
    public static void main(String[] args) {
        //从101-200之间循环判断每个数是不是素数
        System.out.println("101-200之间的素数为：");
        for(int i=101;i<=200;i++){
            if(isPrimeNumber(i)){
                System.out.println(i);
            }
        }

    }

    //判断一个数是不是素数的方法
    public static boolean isPrimeNumber(int n){
        boolean a=true;
        for(int i=2;i<n/2;i++){
            if (n % i == 0) {
                a = false;
                break;
            }
        }
        return a;
    }
}
