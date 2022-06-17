package com.classImprove.polymorphicDemo;

//多态综合案例
/*
* 设计一个电脑对象，可以安装两个usb设备
*   鼠标安装时，可以完成接入，点击、拔出功能
*   键盘安装时，可以完成接入，打字、拔出功能*/
public class Test {
    public static void main(String[] args) {
        Computer c1=new Computer("电脑");
        USB u1=new Keyboard("键盘1号");
        USB m1=new Mouse("鼠标1号");
        c1.install(u1);
        c1.install(m1);
    }
}
