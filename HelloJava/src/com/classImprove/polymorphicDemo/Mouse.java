package com.classImprove.polymorphicDemo;

public class Mouse implements USB{
    private String name;
    public Mouse(String name){
        this.name=name;
    }
    @Override
    public void add() {
        System.out.println(name+"鼠标插入了");
    }

    @Override
    public void delete() {
        System.out.println(name+"鼠标拔出了");
    }

    public void press(){
        System.out.println(name+"鼠标点击了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
