package com.lwq.basic;

public class OperatorTest1 {
    public static void main(String[] args) {
        /*
        * 将一个三位数拆分为百位，十位，个位*/
        //输入一个整型数
        {
            int a = 345;
            for (int i = 0; i < 3; i++) {
                int b = a % 10;
                System.out.println(b);
                a = a / 10;
            }
        }
        //+作为连接符
        {
            int a=5;
            System.out.println(a+"8");
        }
        //自增自减运算符++,--
        /*
        * 自增运算符在前面是先自增再运算，在后面是先运算再自增
        * 自减运算符同理*/
        {
            System.out.println("---------自增自减运算符：---------");
            int a=5;
            int b=5;
            int res=a++;
            System.out.println(a);//6
            System.out.println(res);//5
            res=++a;
            System.out.println(a);//7
            System.out.println(res);//7
//            System.out.println(++a+b);//7
//            System.out.println(a);//6
//            System.out.println(a+++b);//7
//            System.out.println(a);//7
//            System.out.println(a--+b);//8
//            System.out.println(a);//6
//            System.out.println(--a+b);//6
        }
        {
            System.out.println("-------自增自减案例---------");
            int a=3,b=5;
            int res=a++ + ++a- --b+a++ +2;
            //res=3+5-4+5+2=11
            //a=6
            //b=4
            System.out.println(res);
            System.out.println(a);
            System.out.println(b);
        }
        {
            System.out.println("-----赋值（拓展）运算符------");
            int a=10;
            //拓展运算符隐含了强制转换
            System.out.println(a += 10);//20
            System.out.println(a -= 10);//10
            System.out.println(a /=3);//3
            System.out.println(a %= 2);//1
        }
        {
            System.out.println("------关系运算符-------");
            int a=5,b=6;
            System.out.println(a==b);//false
            System.out.println(a!=b);//true
            System.out.println(a<b);//true
            System.out.println(a<=b);//true
            System.out.println(a>b);//false
            System.out.println(a>=b);//false
        }
        {
            System.out.println("-----逻辑运算符-------");
            /*
            * 逻辑运算符包含：&、|、！、^
            * */
            boolean a=true,b=false;
            System.out.println(a&b);//false
            System.out.println(a|b);//true
            System.out.println(!b);//true
            System.out.println(a^b);//true
        }
        {
            System.out.println("------三元运算符-------");
            int a=61;
            String res = a > 60 ? "及格" : "挂科";
            System.out.println(res);
        }
    }
}
