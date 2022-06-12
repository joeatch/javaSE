package com.lwq.basic;

public class Type {
    public static void main(String[] args) {
        //1.数据类型自动转换
        {  //1.1类型范围小的变量可以直接赋值给类型范围大的变量
            byte a=20;
            int b=a;//数据类型发生了自动转换
            System.out.println(b);
            /*
            * 自动转换的其他形式：
            * byte->short->int->long->float->double
            * char->int
            * */
        }
        {//1.2表达式的类型转换
            //小范围类型的变量会自动转换为当前范围较大的变量再进行运算
            // byte,short,char->int->long->float->double
            //在表达式中，byte,short，char直接转换为int类型参与运算
            byte b=10;
            int a=20;
            double c=1.0;
            double res=a+b+c;
            System.out.println(res);
        }
        {
            byte a=20;
            byte b=10;
            int c=a+b;
            System.out.println(c);
        }
        //3.强制类型转换
        {
            int a=20;
            byte b=(byte) a;
            System.out.println(b);
            System.out.println(a);
            int c=1500;
            byte d= (byte) c;
            System.out.println(d);//-36
            /*
            * 强制类型转换有可能造成数据丢失或溢出
            * 浮点型转整型，直接丢掉小数部分
            * */
        }
    }
}
