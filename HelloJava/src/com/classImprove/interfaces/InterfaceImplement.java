package com.classImprove.interfaces;

//接口实现类
public  class InterfaceImplement implements Law {
    private String name;
    public InterfaceImplement(String name){
       this.name=name;
    }
    @Override
    public void run() {
        System.out.println(name+"run方法实现");
    }

    @Override
    public void rat() {
        System.out.println(name+"rat方法实现");
    }

    @Override
    public void rule() {
        System.out.println(name+"遵纪守法");
    }
}
