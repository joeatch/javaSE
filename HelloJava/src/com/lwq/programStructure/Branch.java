package com.lwq.programStructure;

import java.util.Scanner;

//分支结构
public class Branch {
    public static void main(String[] args) {
        //if适合作区间匹配，switch适合作值匹配
        {
            System.out.println("-----if分支结构-------");
            Scanner sc=new Scanner(System.in);
            System.out.println("0.初始化程序");
            System.out.println("1.进入程序");
            System.out.println("2.退出程序");
            System.out.println("3.结束程序");
            System.out.println("请输入指令");
            int inputNumber=sc.nextInt();
            if(inputNumber==0){
                System.out.println("初始化程序");
            }
            else if (inputNumber==1){
                System.out.println("进入程序");
            }
            else if (inputNumber==2){
                System.out.println("退出程序");
            }
            else if (inputNumber==3){
                System.out.println("初始化程序");
            }else{
                System.out.println("指令出错");
            }
        }

        {
            System.out.println("-------switch分支语句------");
            int a=3;
            switch (a){
                case 0:
                    System.out.println("女");
                    break;
                case 1:
                    System.out.println("男");
                    break;
                default:
                    System.out.println("中性");
            }
        }
    }
}
