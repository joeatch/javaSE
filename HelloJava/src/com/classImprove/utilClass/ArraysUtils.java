package com.classImprove.utilClass;
/*需求：在实际开发中，经常会遇到一些数组使用的工具类。请按照如下要求编写一个数组的工具类：ArraysUtils
        1.我们知道数组对象直接输出的时候是输出对象的地址的，而项目中很多地方都需要返回数组的内容，
        请在ArraysUtils中提供一个工具类方法toString，用于返回整数数组的内容，
        返回的字符串格式如：[10, 20, 50, 34, 100]（只考虑整数数组，且只考虑一维数组）
        2.经常需要统计平均值，平均值为去掉最低分和最高分后的分值，请提供这样一个工具方法getAerage，用于返回平均分。（只考虑浮点型数组，且只考虑一维数组）
        3.定义一个测试类TestDemo，调用该工具类的工具方法，并返回结果。*/

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtils {
//    构造器私有化
    private ArraysUtils(){

    }
//    一个工具类方法toString，用于返回整数数组的内容
    public static void toString(double[] arr){
        System.out.println(Arrays.toString(arr));
    }
//    工具方法getAerage,去掉最大最小值求平均
    public static void getAerage(double[] arr){
        double Max=arr[0],Min=arr[0],sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max){
                Max=arr[i];
            }
            if(arr[i]<Min){
                Min=arr[i];
            }
            sum+=arr[i];
        }
        System.out.println((sum-Max-Min)/(arr.length-2));;
    }

}
