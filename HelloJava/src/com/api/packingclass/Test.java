package com.api.packingclass;
/*包装类：
*   其实就是8种基本数据类型对应的引用类型。
*   Byte
    Short
    Integer
    Long
    Character
    Float
    Double
    Boolean
 包装类的作用：
 *  集合和泛型其实也只能支持包装类型，不支持基本数据类型。
 *
* */
public class Test {
    public static void main(String[] args) {
//        包装类的变量的默认值可以是null，容错率更高。
        Integer a=null;
        int b=2;
        a=b;//自动装箱
        int c=a;//自动拆箱
        System.out.println(a);
//        转化为字符串
        String res=a.toString();
        System.out.println(res);
//        将字符串转化为数字
        String in="2222";
        Integer d=Integer.valueOf(in);
        System.out.println(d);
        String in2="2222.0";
        Double out=Double.valueOf(in2);
        System.out.println(out);
        Double out3=Double.parseDouble(in2);
        System.out.println(out3);
    }

}
