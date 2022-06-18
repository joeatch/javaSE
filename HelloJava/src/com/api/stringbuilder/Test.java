package com.api.stringbuilder;

public class Test {
    public static void main(String[] args) {
//        修改String时每次都在丢弃旧对象，新建新对象，然后指向新对象

        StringBuilder sb=new StringBuilder();
//        拼接
        sb.append("sssss");
//       链式编程
        sb.append(1).append("2222");
        System.out.println(sb);
//        反转内容
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
//        将StringBuilder转化为String
        String res=sb.toString();
        System.out.println(res.length());


        int[] a={1,2,3,4,5};
        System.out.println(arrayPrint(a));
    }

//    设计一个方法用于输出任意整型数组的内容,要求输出成如下格式：
//            该数组内容为：[11, 22, 33, 44, 55]”
    public static String arrayPrint(int[] s){
        StringBuilder res=new StringBuilder();
        res.append("[");
        for(int i=0;i<s.length;i++){
            res.append(s[i]);
            if(i!=s.length-1){
                res.append(',');
            }
        }
        res.append("]");
        return res.toString();
    }
}
