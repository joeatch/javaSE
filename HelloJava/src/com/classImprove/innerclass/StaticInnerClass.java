package com.classImprove.innerclass;

public class StaticInnerClass {
    public static void main(String[] args) {
//        创建静态内部类对象
        StaticInnerClass.Inner a=new StaticInnerClass.Inner();
        a.setAge(100);
        System.out.println(a.getAge());
        a.run();
    }

//

//    静态内部类
    static class Inner{
        private int age;
        public void run(){
            System.out.println("静态内部类方法执行了");
        }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
}
