package com.classImprove.utilClass;

public class UtilClassTest {
    /*工具类：
    *     工具类是类的一些静态方法，每个方法完成一个功能
    * 工具类的好处？
    *    一次编写，处处使用，提高代码的复用性
    * 工具类的要求？
    *   工具类的构造器私有化
    * */
    public static void main(String[] args) {
        double[] a={1,2,3,9,8,0,99,9};
        ArraysUtils.toString(a);
        ArraysUtils.getAerage(a);
    }
}
