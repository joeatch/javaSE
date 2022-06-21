package com.datastructure.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
            /*
            * List系列集合特点:
            *   ArrayList、LinekdList ：有序，可重复，有索引。
            * List集合因为支持索引，所以多了很多索引操作的独特api，其他Collection的功能List也都继承了。
            * void add(int index,E element)
              E remove(int index)
              E set(int index,E element)
              E get(int index)
            * */
        ArrayList<Integer> al=new ArrayList<>();
        al.add(2);
        al.add(5);
        al.add(6);
        System.out.println(al);
        al.add(1,4);
        System.out.println(al);
        al.remove(1);
        System.out.println(al);
        al.set(0,3);
        System.out.println(al);
        System.out.println(al.get(0));

        LinkedList<Integer> ld=new LinkedList<>();
//        LinkedList集合的特有功能
        /*
        *   public void addFirst(E e)
            public void addLast(E e)
            public E getFirst()
            public E getLast()
            public E removeFirst()
            public E removeLast()*/
        ld.add(2);
        ld.add(7);
        ld.add(10);
        System.out.println(ld);
        ld.remove(0);
        System.out.println(ld);
        ld.set(0,2);
        System.out.println(ld);
        System.out.println(ld.get(1));
        /*
        * List集合的遍历方式有几种？
            迭代器
            增强for循环
            Lambda表达式
            for循环（因为List集合存在索引）*/
        System.out.println("-------集合的并发修改问题---------");
        ArrayList<Integer> arr =new ArrayList<>();
//        往数组里面添加元素
        arr.add(1);
        arr.add(1);
        arr.add(3);
        arr.add(1);
        arr.add(3);
        arr.add(1);
        arr.add(3);
        arr.add(1);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(1);
        System.out.println(arr);
//        用迭代器循环遍历删除3
        Iterator<Integer> it=arr.iterator();
        while(it.hasNext()){
            if(it.next().equals(3)){
                it.remove();//删除当前元素并且不会后移
            };
        }
        System.out.println(arr);
//foreach，增强for遍历删除,一定有集合修改异常
//        for循环边遍历，边删除
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).equals(5)){
                arr.remove(i);
                i--;//或者倒着删
            }
        }
        System.out.println(arr);

    }
}
