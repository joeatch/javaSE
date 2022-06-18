package com.api.object;

import java.util.Objects;

public class Student {
    private String name;
    private String role;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name,String role,int age){
        this.age=age;
        this.name=name;
        this.role=role;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                '}';
    }
    public static int number;
    public static Student stu=new Student("默认","默认",200);

    @Override
    public boolean equals(Object o) {
//        判断是不是同一个对象
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(role, student.role);
    }

}
