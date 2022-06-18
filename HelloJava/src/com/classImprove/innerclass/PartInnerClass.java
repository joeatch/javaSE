package com.classImprove.innerclass;

public class PartInnerClass {
    public PartInnerClass(){
        class Student{
            public int age=100;
        }
        Student stu2=new Student();
        System.out.println(stu2.age);
    }

//    局部内部类放在方法、代码块、构造器等执行体中。(鸡肋语法，了解即可)
public static void main(String[] args) {
    PartInnerClass  Pic=new PartInnerClass();

}
}
