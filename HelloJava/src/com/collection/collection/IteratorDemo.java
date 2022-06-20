package com.collection.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* 迭代器
*   遍历就是一个一个的把容器中的元素访问一遍。
*   迭代器在Java中的代表是Iterator，==迭代器是集合的专用的遍历方式==。*/
public class IteratorDemo {
    public static void main(String[] args) {
//        新建一个集合
        Collection<String> ld=new ArrayList<>();
        ld.add("测试");
        ld.add("测试1");
        ld.add("测试2");
        ld.add("测试3");
        ld.add("测试4");
//       得到当前集合的迭代器对象
        Iterator<String> it=ld.iterator();
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());//NoSuchElementException

//        询问当前位置是否有元素存在，存在返回true ,不存在返回false
        while(it.hasNext()){
//            获取当前位置的元素，并同时将迭代器对象移向下一个位置，注意防止取出越界。
            System.out.println(it.next());
        }
        System.out.println("---------增强for循环----------------------");
//        增强for循环，既可以遍历结合，也可以遍历数组
        for(String p:ld){
            System.out.println(p);
        }
        System.out.println("-----------lambda表达式--------------------");
        ld.forEach(s->{
            System.out.println(s);
        });
    }
}
