package com.lwq.hello;
//Literal字面量
//variable变量
public class Literal {
    public static void main(String[] args) {
        //常见数据在程序中的数据
        //1.整数
        int a=666;
        //2.小数
        /*  2.1.float是单精度浮点数，内存分配4个字节，占32位，有效小数位6-7位
            double是双精度浮点数，内存分配8个字节，占64位，有效小数位15位

            2.2.java中默认声明的小数是double类型的，如double d=4.0
            如果声明： float x = 4.0则会报错，需要如下写法：float x = 4.0f或者float x = (float)4.0
            其中4.0f后面的f只是为了区别double，并不代表任何数字上的意义

            2.3.对编程人员来而，double 和 float 的区别是double精度高，但double消耗内存是float的两倍，且double的运算速度较float稍慢。
         */
        double b=0.1;
        float c=0.1f;
        //特殊的字符"\n"：换行
        // "\t":tab
        //3.字符
        char d='c';
        //4.字符串
        String e="你好";
        //5.布尔值
        boolean f=true;
        //6.空值
        Object g=null;

        System.out.println("\t"+a+"\n");
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        g=2;
        System.out.println(g);
        System.out.println(g.getClass());
        System.out.println(g.getClass().getName());
        /*计算机中的字节使用8个二进制位为一组，称为一个字节（byte，B)
        *   其中每一个二进制位称为一位（bit）
        * 1 byte=8 bit 简写为1B=8b
        * */


        /*字符数据在计算机是如何存储的？
        通过ascii编码转化为二进制进行存储
        其中'0'对应的十进制数字为48
            'A'对应的十进制数字为65
            'a'对应的十进制数字为48
        * */
        System.out.println((int) d);


        /*十进制转二进制：除2取余法
           二进制转十进制；
           二进制（以ob开头）
           二进制转8进制：每3位二进制数字为一组（以0开头）
           二进制转16进制：每4位二进制数字为一组（以0x开头）
        * */

        int i=0b01100001;
        int j=0141;
        int k=0x61;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
