package com.lwq.programStructure;

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
    }
}
