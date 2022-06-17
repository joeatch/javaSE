package com.classImprove;

public class User {
//    静态成员变量
    public static int onlineNumbers=161;
//    实例成员变量
    public int age;
    private String name;

    public static void main(String[] args) {
        User user2=new User();
        user2.name="李四";
        System.out.println(user2.name);
//        同一个类中的静态成员变量，可以省略类名
        System.out.println(onlineNumbers);
    }
}
