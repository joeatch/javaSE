package com.calss.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
案例：
    学生信息系统的数据搜索
    后台程序需要存储如上学生信息并展示，然后要提供按照学号搜索学生信息的功能。
    分析：
        定义Student类，定义ArrayList集合存储如上学生对象信息，并遍历展示出来。
        提供一个方法，可以接收ArrayList集合，和要搜索的学号，返回搜索到的学生对象信息，并展示。
        使用死循环，让用户可以不停的搜索。
* */
public class ApiArrayListTest2 {
    public static void main(String[] args) {
        Student stu1=new Student("22202992","lisa","20");
        Student stu2=new Student("22202993","lisa","21");
        Student stu3=new Student("22202994","lisa","22");
        ArrayList<Student> stuList=new ArrayList<>();
        Collections.addAll(stuList,stu1,stu2,stu3);
        for(int i=0;i<stuList.size();i++){
            stuList.get(i).stuShow();
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生的学号");
        boolean isLoop=true;
        System.out.println("开始循环，请输入学号");
        while (isLoop){
            String idInput=sc.next();
            if(idInput.equals("q")){
                isLoop=false;
            }
            for(int i=0;i<stuList.size();i++){
                if(idInput.equals(stuList.get(i).getid())){
                    stuList.get(i).stuShow();
                }
            }

        }
    }
    public static class Student{
        private String id;
        private String name;
        private String age;
        public Student(){

        }
        public Student(String id,String name,String age){
            this.id=id;
            this.name=name;
            this.age=age;

        }
        public void stuShow(){
            System.out.println(this.id);
            System.out.println(this.name);
            System.out.println(this.age);
            System.out.println("======");
        }
        public String getid(){
            return this.id;
        }
    }
}
