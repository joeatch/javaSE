package com.api.object;
//.equals方法
//.toString方法
public class Test {
    public static void main(String[] args) {
        Student stu1=new Student("liming","student",20);
        Student stu2=new Student("liming","student",20);
        System.out.println(stu1);
        System.out.println(stu1.equals(stu2));
        Student stu3=Student.stu;
        Student stu4=Student.stu;
        System.out.println(stu3==stu4);
    }
}
