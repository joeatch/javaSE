package com.datastructure.genericclasses;

import java.util.ArrayList;

//泛型类E\T\K\V
public class MyArrayList<E> {
    private final ArrayList<E> list=new ArrayList<E>();
//    以下只是在使用泛型，不是泛型方法
    public void add(E e){
        list.add(e);
    }
    public void remove(E e){
        list.remove(e);
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "list=" + list +
                '}';
    }
    //    泛型方法
    public static <T> void show(T[] t){
        StringBuilder sb=new StringBuilder("[");
        if (t != null) {
            for (T ti:t) {
                sb.append(ti);
                sb.append(" ");
            }
            sb.append("]");
            System.out.println(sb);
        }else{
            System.out.println(t);
        }
    }
}
