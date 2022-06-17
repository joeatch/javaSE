package com.classImprove.polymorphicDemo;

public class Computer {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public Computer(String name){
        this.name=name;
    }
//    提供安装USB设备的方法
    public void install(USB usb){
//       usb可能是键盘，也可能是鼠标
        usb.add();
        if(usb instanceof Keyboard){
            Keyboard usb1=(Keyboard) usb;
            usb1.keydown();
        }else if(usb instanceof Mouse){
            Mouse usb2=(Mouse) usb;
            usb2.press();
        }
        usb.delete();
    }


}
