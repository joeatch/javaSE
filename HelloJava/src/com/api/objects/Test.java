package com.api.objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String s1=new String("测试");
        String s2=new String("测试");
        String s3=null;
//Objects.equals
        System.out.println(s1.equals(s2));
//        System.out.println(s3.equals(s2));
        System.out.println(Objects.equals(s2,s3));
        System.out.println(Objects.equals(s1,s2));
        System.out.println(Objects.isNull(s3));
        System.out.println(s3==null);
    }



}
