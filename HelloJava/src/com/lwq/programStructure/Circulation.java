package com.lwq.programStructure;

import java.util.Random;
import java.util.Scanner;

//循环结构
public class Circulation {
    public static void main(String[] args) {
        {
            System.out.println("-------for循环---------");
            for(int i=0;i<3;i++){
                System.out.println(i);
            }
        }
        {
            System.out.println("------求和------------");
            /*求和:求1-5之间的数据的和*/
            int res=0;
            for(int i=1;i<=5;i++){
                res+=i;
            }
            System.out.println(res);
        }
        {
            System.out.println("-------求奇数和---------");
            /*求出1-10之间的奇数的和*/
            int res=0;
            for(int i=1;i<=10;i++){
                if(i%2==1){
                    res+=i;
                }
            }
            System.out.println(res);
        }
        {
            System.out.println("------求出水仙花数--------");
            /*
            * 水仙花数为三位数，个位、十位、百位的数字立方和等于原数*/
            for(int i=1;i<=9;i++){
                for(int j=0;j<=9;j++){
                    for(int k=0;k<=9;k++){
                        if(i*i*i+j*j*j+k*k*k==100*i+10*j+k){
                            System.out.println(100*i+10*j+k);
                        }
                    }
                }
            }
        }

        {
            System.out.println("------while循环--------");
            int i=0,res=0;
            while(i<3){
                res+=i;
                i++;
            }
            System.out.println(res);
        }

        /*
        * 一开始知道循环几次，用for循环；不知道循环几次，用for循环
        * */
        {
            System.out.println("----珠穆朗玛峰案例（while案例）-----");
            /*
            * 珠穆朗玛峰的高度为8848860mm
            * 纸的厚度为0.1mm
            * 纸折叠多少次可以折叠为珠穆朗玛峰的高度
            * */
            double a=0.1,b=8848860;
            int i=0;
            while(a<b){
                i=i+1;
                a=a*2;
            }
            System.out.println(i);
        }
        {
            System.out.println("-----do...while循环结构-----");
            //先执行在判断循环条件
            int i=0;
            do{
                i++;
            }while(i<3);
            System.out.println(i);
        }
        {
            System.out.println("-------输入密码案例----------");
            /*
            需求：系统密码是520，请用户不断的输入密码验证，验证不对输出：
            密码错误，验证成功输出：欢迎进入系统，并停止程序。
            * */
            int psw=520;
            Scanner sc=new Scanner(System.in);
            do{
                System.out.println("请输入密码");
                int input=sc.nextInt();
                if(input==psw){
                    System.out.println("密码正确，欢迎进入系统");
                    break;
                }else{
                    System.out.println("密码错误，请重新输入");
                }
            }while(true);
        }
        /*
        * 跳转关键词：break，continue
        * 其中，break： 跳出并结束当前所在循环的执行。
        *      continue:  用于跳出当前循环的当次执行，进入下一次循环。
         * */
        {
            System.out.println("-----随机数的生成-------");
            Random r=new Random();
            //nextInt(n) 功能只能生成: 0 至 n-1之间的随机数，不包含n。
            int num=r.nextInt(10);
            System.out.println(num);

        }

    }
}
