package com.classImprove;
/*
 * static关键词
 *       静态的意思，可以修饰==成员变量==、==成员方法==
 *       静态成员变量（有static修饰，属于类、加载一次，内存中只有一份），访问格式：类名.静态成员变量
 *       实例成员变量（无static修饰，属于对象），访问格式：对象.实例成员变量
 *2.两种成员变量（静态成员变量、实例成员变量）各自在什么情况下定义？
 *       静态成员变量：表示在线人数等需要被类的所有对象共享的信息时。
 *       实例成员变量：属于每个对象，且每个对象的该信息不同时。
 *3.成员方法的分类：
 *       静态成员方法（有static修饰，归属于类），建议用类名访问，也可以用对象访问。
 *       实例成员方法（无static修饰，归属于对象），只能用对象触发访问。
 * 4.两种成员方法的使用场景
 *       表示对象自己的行为的，且方法中需要访问实例成员的，则该方法必须申明成实例方法。
 *       如果该方法是以执行一个共用功能为目的，则可以申明成静态方法。
 * */

public class KeyWords {
    public static void main(String[] args) {

        System.out.println(User.onlineNumbers);
        User user1=new User();
        user1.age=18;
        System.out.println(user1.age);
//        System.out.println(user1.onlineNumbers);
    }


}
