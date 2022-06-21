package com.datastructure.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
//        栈，先进后出
        Stack st=new Stack<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
