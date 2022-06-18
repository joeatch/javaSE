package com.classImprove.innerclass;

public class InstanceInnerClass {
    public static int age=100;
    public int number=20;
    public static void main(String[] args) {
//        创建一个成员内部类对象
        InstanceInnerClass.Student stu1=new InstanceInnerClass().new Student();
        stu1.run();
    }

//    成员内部类,成员内部类属于对象
    public class Student{
        public void run(){
            System.out.println("学生会跑");
//            成员内部类可以直接访问外部类的静态成员
            System.out.println(age);
//            实例方法中可以直接访问外部类的实例成员。
            System.out.println(number);
        }
    }
}
