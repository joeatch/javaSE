package com.lwq.programStructure;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        /*
        * 随机生成一个1-100之间的数据，提示用户猜测，猜大提示过大，猜小提示过小，直到猜中结束游戏
        * */
        //1.随机生成一个数字
        Random r=new Random();
        int randomNumber= r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("请输入一个1-100之间的数字");
            int input= sc.nextInt();
            if(input==randomNumber){
                System.out.println("恭喜您猜对了，数字为"+randomNumber);
                break;
            };
            if(input>randomNumber){
                System.out.println("您输入的数字过大");
            }
            if(input<randomNumber){
                System.out.println("您输入的数字过小");
            }

        }while(true);
    }
}
