package com.calss.api;

import java.util.ArrayList;
import java.util.Collections;

public class ApiArrayListTest1 {
    public static void main(String[] args) {
        /*
        * 遍历并删除元素值*/
        ArrayList<Integer> scores=new ArrayList<>();
        Collections.addAll(scores,98, 77, 66, 89, 79, 50, 100);
        System.out.println(scores);
//        现在需要先把成绩低于80分以下的数据去掉。
//        遍历数组
        for(int i=0;i<scores.size();i++){
            if(scores.get(i)<80){
                scores.remove(i);
                i=i-1;
            }
        }
        System.out.println(scores);



        /*案例2：
            某影院系统需要在后台存储上述三部电影，然后依次展示出来。
                定义一个电影类，定义一个集合存储电影对象。
                创建3个电影对象，封装相关数据，把3个对象存入到集合中去。
                遍历集合中的3个对象，输出相关信息。
        * */
//        构造三个电影对象
        Movies mov1=new Movies("飞天","China");
        Movies mov2=new Movies("飞天2","China");
        Movies mov3=new Movies("飞天3","China");
//        构建一个集合，将电影对象存入集合中
        ArrayList<Movies> movList=new ArrayList<>();
        Collections.addAll(movList,mov1,mov2,mov3);
//        遍历相关的集合，输出相关的信息
//        集合中存储的元素并不是对象本身，而是对象的地址。
        for(int i=0;i<movList.size();i++){
           movList.get(i).print1();
        }
//
    }
//    定义一个电影类
    public static class Movies{
       private String name;
       private String country;
       public Movies(){

       }
       public Movies(String name,String country){
           this.name=name;
           this.country=country;

       }
       public void print1(){
           System.out.println(this.name);
           System.out.println(this.country);
           System.out.println("====");
       }
    }
}
