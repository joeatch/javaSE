package com.classImprove.innerclass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
//        创建窗口
        JFrame win=new JFrame("登录页面");
//        创建幕布
        JPanel panel=new JPanel();
//        将幕布添加到窗口上
        win.add(panel);
        JButton btn=new JButton("登录");
        panel.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(win,"登录成功");
            }
        });

        win.setSize(200,200);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}
