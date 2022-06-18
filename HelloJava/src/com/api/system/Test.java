package com.api.system;

import java.util.Arrays;

//system也不能实例化
public class Test {
    public static void main(String[] args) {
//        获取时间毫秒值，可以进行时间的计算
        long start=System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        int[] a={1,2,3,4,5,6};
        int[] b={1,3,3,3,3,3};
/*
* 参数-：拷贝的原数组
* 参数二：拷贝数组的起始索引
* 参数三：目标数组
* 参数四：拷贝的数据的个数*/
        System.arraycopy(a,1,b,0,3);
        System.out.println(Arrays.toString(b));
        long end=System.currentTimeMillis();
        System.out.println((end-start)/1000.0+"s");
//      关闭虚拟机
        System.exit(0);
    }
}
