package com.lwq.method;

import java.util.Arrays;

public class MethodDemo2 {
    public static void main(String[] args) {
        int[] a={1,2,34,7,8};
        int[] c={1,2,34,7,8,2};
        arrayPrint(a);
        int b=search(a,9);
        System.out.println(b);
        isSame(a,c);
    }
    //设计一个方法用于输出任意整型数组的内容
    public static void arrayPrint(int[] a){
        System.out.println(Arrays.toString(a));
    }
    //设计一个方法可以接收整型数组，和要查询的元素值；最终要返回元素在该数组中的索引，
    // 如果数组中不存在该元素则返回 -1。
    public static int search(int[] arr,int n){
        int res=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                res=i;
            }
        }
        return res;
    }
//    判断两个数组是否是一样的
//    如果两个数组的类型，元素个数，元素顺序和内容是一样的我们就认为这2个数组是一模一样的。
    public static void isSame(int[] arr1,int[] arr2){
        if(arr1.length!=arr2.length){
            System.out.println("两个数组不一样");
        }else{
            int res=0;
            for(int i=0;i< arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    res=1;
                    break;
                };
            }
            if(res==0){
                System.out.println("两个数组一样");
            }else{
                System.out.println("两个数组不一样");
            }
        }
    }
}
