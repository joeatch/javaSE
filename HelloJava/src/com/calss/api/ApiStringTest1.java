package com.calss.api;

import java.util.Scanner;

public class ApiStringTest1 {
    public static void main(String[] args) {
//        模拟用户登录功能，最多只给三次机会。
        User user1=new User("admin","123456");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("请输入账号");
            String username=sc.next();
            System.out.println("请输入密码");
            String password=sc.next();
            if(username.equals(user1.username)&password.equals(user1.password)){
                System.out.println("登录成功");
                break;
            }else{
                System.out.println("登录失败，账号或密码错误");
            }
        }

    }
    public static class User{
        private String username;
        private String password;
        public User(String username,String password){
            this.username=username;
            this.password=password;
        }
        public User(){

        }
    }
}
