package com.collection.collection;
/*
* 1.为什么选择集合？
    数组的特点：
        数组定义完成并启动后，类型确定、长度固定。
        不适合元素的个数和类型不确定的业务场景，更不适合做需要增删数据操作。
        数组的功能也比较的单一，处理数据的能力并不是很强大。
    集合的特点：
        集合的大小不固定，启动后可以动态变化，类型也可以选择不固定。集合更像气球。
        集合非常适合元素个数不能确定，且需要做元素的增删操作的场景。
        同时，集合提供的种类特别的丰富，功能也是非常强大的，开发中集合用的更多。*/
/*
* 1、数组和集合的元素存储的个数问题。
    数组定义后类型确定，长度固定
    集合类型可以不固定，大小是可变的。
`2、数组和集合存储元素的类型问题。
    数组可以存储基本类型和引用类型的数据。
    集合只能存储引用数据类型的数据。
3、数组和集合适合的场景
    数组适合做数据个数和类型确定的场景。
    集合适合做数据个数不确定，且要做增删元素的场景，集合种类更多，功能更强大。
* */

//集合类体系结构
//    Collection单列集合，每个元素（数据）只包含一个值。
//    Map双列集合，每个元素包含两个值（键值对）。

/*
* Collection集合特点:
*    List系列集合：添加的元素是有序、可重复、有索引。
        ArrayList、LinekdList ：有序、可重复、有索引。
     Set系列集合：添加的元素是无序、不重复、无索引。
        HashSet: 无序、不重复、无索引；LinkedHashSet: 有序、不重复、无索引。
        TreeSet：按照大小默认升序排序、不重复、无索引。
 * */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

/*
* 泛型
*    集合都是泛型的形式，可以在编译阶段约束集合只能操作某种数据类型
 */
public class Test {
    public static void main(String[] args) {
//        创建一个集合
        LinkedList<Integer> ld1=new LinkedList<Integer>();
//        向集合中添加元素
        ld1.add(2);
        System.out.println(ld1);
//        清空集合中的所有元素
        ld1.clear();
        System.out.println(ld1);
        ld1.add(2);
        ld1.add(1);
        ld1.add(2);
        ld1.add(1);
        ld1.add(2);
        System.out.println(ld1);
        ld1.remove(1);
        System.out.println(ld1);
//        判断当前集合中是否包含给定的对象
        System.out.println(ld1.contains(3));
//        判断当前集合是否为空
        System.out.println(ld1.isEmpty());
//        输出集合的大小
        System.out.println(ld1.size());
//        把集合中的元素存在数组中
        Object[] b=ld1.toArray();
        System.out.println(Arrays.toString(b));
        LinkedList ld2=new LinkedList();
        ld2.add(1);
        ld2.add("jaja");
        System.out.println(ld2);
    }
}
