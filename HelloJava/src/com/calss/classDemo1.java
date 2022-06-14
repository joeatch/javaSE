package com.calss;
/*
* 在Java中，必须先设计类，才能创建对象并使用。
* 1.设计类
    public class 类名 {
          1、成员变量（代表属性,一般是名词)
           2、成员方法（代表行为,一般是动词）
           3、构造器
           4、代码块
           5、内部类
    }
2.创建类的对象
   类名 对象名 = new 类名();

3.如何使用对象
*   访问属性:   对象名.成员变量
    访问行为:   对象名.方法名(…)
4.this关键词
    可以出现在构造器、方法中；代表当前对象的地址。
    * 可以用于指定访问当前对象的成员变量、成员方法。
* */
public class classDemo1 {
    public static void main(String[] args) {
//        构造器：构造一个对象，并返回对象的地址
        /*
        * 任何类定义出来，默认就自带了无参数构造器，写不写都有。
          一旦定义了有参数构造器，那么无参数构造器就没有了，
*         如果还想用无参数构造器，此时就需要自己手写一个无参数构造器了。*/
        Stu stu1=new Stu();
        Stu stu2=new Stu("测试",22);
        System.out.println(stu1);
        stu1.setName("连悄悄");
        stu1.setAge(24);
        System.out.println(stu1.name);
        System.out.println(stu1.age);
        System.out.println(stu2.name);
        System.out.println(stu2.age);

    }
    public static class Stu{
//        类属性
        String name;
        int age;
//        类方法
        public void setName(String name){
            this.name=name;
        }
        public void setAge(int age1){
            age=age1;
        }
//        无参数构造器
        public Stu(){

        }
//        有参数构造器
        public Stu(String str,int age1){
            name=str;
            age=age1;
        }
    }
}
/*
* 1. 对象到底是放在哪个位置的？
    堆内存中
2. Car c = new Car();  c变量名中存储的是什么？
    存储的是对象在堆内存中的地址。
3. 成员变量（name、price）的数据放在哪里，存在于哪个位置？
    对象中，存在于堆内存中。
*
* */
