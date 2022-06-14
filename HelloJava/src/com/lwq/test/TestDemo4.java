package com.lwq.test;

import java.util.Arrays;

public class TestDemo4 {
    public static void main(String[] args) {

        //案例4：数组拷贝
        int[] a={1,2,3,4,6};
        int[] b=new int[a.length];
        System.arraycopy(a, 0, b, 0, a.length);
        b[0]=2;
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));


        //案例5：评委打分
//        在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
//        选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，
//        用一个数组存储六个分数
        int[] scores={60,30,90,80,70,80};
        System.out.println(scoreAvr(scores));


    }
    public static int scoreAvr(int[] arr){

//        定义三个变量，分别对应最大值，最小值，和
        int scoreMax=arr[0],scoreMin=arr[0],sum=0;
//        遍历数组，求得数组的最大值，最小值和和
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(arr[i]>scoreMax){
                scoreMax=arr[i];
            }
            if(arr[i]<scoreMin){
                scoreMin=arr[i];
            }
        }
        return (sum-scoreMax-scoreMin)/(arr.length-2);
    }
}
