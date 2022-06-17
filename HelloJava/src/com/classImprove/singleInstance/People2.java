package com.classImprove.singleInstance;

public class People2 {
    public static People2 p1;
//    私有化构造函数
    private People2(){

    }
    public static People2 getInstance(){
        if(p1==null){
            p1=new People2();
        }
        return p1;
    }

}
