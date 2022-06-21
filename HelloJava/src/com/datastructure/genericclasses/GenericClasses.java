package com.datastructure.genericclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericClasses {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("java");
        list.add("c++");
        list.add("spring");
        System.out.println(list);
        List<Object> list2=new ArrayList<>();

        MyArrayList<String> marr=new MyArrayList<>();
        marr.add("1111");
        marr.add("1111");
        System.out.println(marr);
        marr.remove("1111");
        marr.remove("1111");
        System.out.println(marr);
        String[] names={"xiaoli","xiaomei","xaiorong"};
        Integer[] age={2,3,4};
        MyArrayList.show(names);
        MyArrayList.show(age);
    }

//    定义类时同时定义了泛型的类就是泛型类。
//    泛型类的格式：修饰符 class 类名<泛型变量>{  }
//    此处泛型变量T可以随便写为任意标识，常见的如E、T、K、V等。
//    作用：编译阶段可以指定数据类型，类似于集合的作用。


}
