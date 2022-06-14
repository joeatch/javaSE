package com.calss.api;

import java.util.ArrayList;

/*ArrayList
       集合类，集合是一种容器，与数组类似，不同的是集合的大小是不固定的。
       创建ArrayList的对象表示得到一个集合容器
  集合的特点：
      集合的大小不固定，启动后可以动态变化，类型也可以选择不固定。
      集合非常适合做元素个数不确定，且要进行增删操作的业务场景。
      集合还提供了许多丰富、好用的功能，而数组的功能很单一。
*
  ArrayList是集合中的一种，它支持索引。
* */
public class ApiArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrl=new ArrayList<String>();
        System.out.println(arrl);
//        往集合的末尾添加元素
        arrl.add("1");
//        往集合的指定位置添加元素
        arrl.add(1,"2");
        arrl.add(1,"3");
        System.out.println(arrl);


        /*
        泛型类
            ArrayList<E>：其实就是一个泛型类，可以在编译阶段约束集合对象只能操作某种数据类型。
            泛型只能支持引用数据类型，不支持基本数据类型。
        * */
        ArrayList<Integer> list1 = new  ArrayList();
        list1.add(2);

        /*
        * ArrayList集合常用方法
        *    */
//        返回指定索引处的元素
        String a=arrl.get(1);
        System.out.println(a);
//        返回集合中的元素的个数
        System.out.println(arrl.size());
//        删除指定索引处的元素，返回被删除的元素
        System.out.println(arrl.remove(0));
        System.out.println(arrl);
//        删除指定的元素，返回删除是否成功
        System.out.println(arrl.remove("2"));
//        修改指定索引处的元素，返回被修改的元素
        System.out.println(arrl.set(0,"4"));
        System.out.println(arrl);



    }
}
