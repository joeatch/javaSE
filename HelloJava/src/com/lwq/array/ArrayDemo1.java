package com.lwq.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        {
            System.out.println("--新建一个数组,将数组转化为string输出--");
            int[] a = {1, 2, 3, 4};
            String[] b = {"liwn", "test", "jieshu"};
//            直接输出a为a的首地址，数组为引用类型
            System.out.println(a);
            System.out.println(Arrays.toString(b));
            System.out.println(Arrays.toString(a));
            System.out.println(a.length);//数组的长度
        }
        {
            System.out.println("-----随机点名功能实现--------");
            String[] names={"李万乔","万乔李","乔万里"};
//            随机生成一个0-2的数字，作为数组的索引
            Random r=new Random();
            int a=r.nextInt(3);
            System.out.println(a);
            System.out.println("随机点名的对象为：");
            System.out.println(names[a]);
        }
        {
            System.out.println("-----动态数组的初始化--------");
//            初始化一个动态数组，只指定数组的长度，不指定数组的值
//            系统会默认会数组赋初始值
            int[] a=new int[3];
            System.out.println(Arrays.toString(a));
            a[0]=1;
            System.out.println(Arrays.toString(a));
        }
        {
            System.out.println("数组的遍历------数组求和--------");
            int sum=0;
            int[] a={1,3,4,6,7};
            for (int j : a) {
                sum+=j;
                System.out.println(j);
            }
            System.out.println("数组的和为"+sum);
        }
        {
            System.out.println("------数组元素求最大值-------");
            int[] scores={100,200,500,300,400,200};
            int temp=scores[0];//定义一个变量用来存储最大值
            for (int j:scores){
                if(j>temp){
                    temp=j;
                }
            }
            System.out.println(temp);
        }
        {
            System.out.println("------猜数字游戏-------");
            /*
            * 后台生成1-20之间的五个数（无所谓是否重复），然后让大家来数字
            * 为猜中，提示未猜中，并继续猜测
            * 才猜中了，则提示运气不错，猜中了，并输出数字第一次出现的位置
            * 并输出五个数字，并结束游戏*/
//            生成五个数字，存储在数组中
            Random r=new Random();
            int[] a=new int[5];
            for(int i=0;i<5;i++){
                a[i]=r.nextInt(20)+1;
            }
            Scanner sc=new Scanner(System.in);
            boolean res=true;
            System.out.println("----请输入1-20之间的一个数字-----");
            while(res) {
                int temp = sc.nextInt();
                //对输入的数字进行判断
                for (int i = 0; i < a.length; i++) {
                    if (a[i] == temp) {
                        System.out.println("数字第一次出现的位置为" + i);
                        System.out.println(Arrays.toString(a));
                        res = false;
                    }
                }
                if (res) {
                    System.out.println("输入错误，请重新输入");
                }
            }
        }
        {
            System.out.println("-----随机排名---------");
            /*
             * 某公司开发部5名开发人员，要进行项目进展汇报演讲，
             * 现在采取随机排名后进行汇报。
             * 请先依次录入5名员工的工号，然后展示出一组随机的排名顺序。
             */

                /*
                * 定义一个动态初始化的数组用于录入数据。
                    遍历数组中的每个元素，每次随机一个索引值，让当前元素与该索引位置处的元素进行交换。
                    遍历输出数组中的内容即可*/
            int[] a={22,48,87,99,34};
            Random r=new Random();
            for(int i=0;i<5;i++){
                int temp=a[i];
                int j=r.nextInt(5);
                a[i]=a[j];
                a[j]=temp;
            }
            System.out.println(Arrays.toString(a));
        }
    }
}
