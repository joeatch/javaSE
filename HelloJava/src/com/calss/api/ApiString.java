package com.calss.api;

/*String类
    定义的变量可以用于存储字符串，同时String类提供了很多操作字符串的功能，我们可以直接使用。
    1.如何创建字符串对象，并使用String定义变量指向该字符串对象。

    2.字符串对象在内存中的原理
        以“”方式给出的字符串对象，在字符串常量池中存储。
    3.String类提供的操作字符串的功能：遍历、替换、截取、相等

    4.String是不可变字符串的原因
         String变量每次的修改其实都是产生并指向了新的字符串对象。
         原来的字符串对象都是没有改变的，所以称不可变字符串。

* */


import java.util.Arrays;

public class ApiString {
    public static void main(String[] args) {
        String str1=new String("123a");
        String str2=new String("123A");
        char[] a={'1','2','3','4'};
//        byte[] b={3,4};

        String str6=new String(a);
//        String str7=new String(b);
        System.out.println(str6);
        System.out.println("---");
//        System.out.println(str7);

//        /*创建字符串对象的两种方式
//              直接使用""定义
//              通过String类的构造器创建对象
//           字符串对象的特点有哪些？
//               双引号创建的字符串对象，在字符串常量池中存储同一个。
//               通过new 构造器创建的字符串对象，在堆内存中分开存储。
//          */
        String str5="ehsi ";

        System.out.println(str1);
//        字符串长度
        System.out.println(str1.length());
//        连接两个数组
        System.out.println(str1.concat(str2));
//      返回指定索引处的 char 值。
        System.out.println(str1.charAt(2));
        /*
        * 字符串内容比较：
        *   equals方法
        *       将此字符串与指定对象进行比较。只关心字符内容是否一致！
        *   equalsIgnoreCase
        *       将此字符串与指定对象进行比较，忽略大小写比较字符串。只关心字符内容是否一致！
        *   基本数据类型比较时使用==进行比较
        * */
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
//        将当前字符串转换成字符数组返回
        System.out.println(Arrays.toString(str1.toCharArray()));
//        根据开始和结束索引进行截取，得到新的字符串（包前不包后）
        System.out.println(str1.substring(1,3));
//        从传入的索引处截取，截取到末尾，得到新的字符串
        System.out.println(str1.substring(1));
//        使用新值，将字符串中的旧值替换，得到新的字符串
        System.out.println(str1.replace('1','2'));
        System.out.println(str1.compareTo(str2));
//          根据传入的规则切割字符串，得到字符串数组返回
        String str3=new String("1,233333");
        String[] str4=str3.split(",");
        System.out.println(str4[0]);
        System.out.println(str4[1]);

    }
}
