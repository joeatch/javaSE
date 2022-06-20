package com.api.arrays;

import java.util.Arrays;
import java.util.Comparator;

/*
*   Arrays工具类，用于操作数组元素
*
*
* */
public class Test {
    public static void main(String[] args) {
        Integer[] arr={1,9,3,7,4};
//        将数组转化为字符串
        String res= Arrays.toString(arr);
        System.out.println(res);
//        将数组默认升序排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        二分搜索数组中的数据，存在返回索引，不存在返回-位置-1
        System.out.println(Arrays.binarySearch(arr, 3));
        //        使用比较器对象自定义排序
        Arrays.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
//                指定排序的规则
                return o2-o1;//逆序排序
            }
        });
        System.out.println(Arrays.toString(arr));
        Student[] students=new Student[3];
        students[0]=new Student("lisa",18);
        students[1]=new Student("lisa2",30);
        students[2]=new Student("lisa3",20);
        Arrays.sort(students, (o1, o2) ->  o2.getAge() - o1.getAge());
        System.out.println(Arrays.toString(students));
    }
}
