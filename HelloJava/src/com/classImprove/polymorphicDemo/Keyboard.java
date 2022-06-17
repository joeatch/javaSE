package com.classImprove.polymorphicDemo;

public class Keyboard implements USB{
    private String name;

    @Override
    public void add() {
        System.out.println(name+"键盘插入了");
    }

    @Override
    public void delete() {
        System.out.println(name+"键盘拔出了");
    }

    public void keydown(){
        System.out.println(name+"键盘敲击了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Keyboard(String name){
        this.name=name;
    }
}
