package com.feifei.observerpattern.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Swing观察者示例
 * 这也是个观察着模式：
 * 被观察者就是按钮，按钮的状态发生改变时，通知每个观察者，执行actionPerformed动作
 * @author xuxiangfei
 * @date 2019/10/29
 */
public class SwingObserverExample {

    JFrame jFrame;


    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go () {
        jFrame = new JFrame();
        JButton jButton = new JButton("Should I do it?");
        jButton.addActionListener(new AngleListener());
        jButton.addActionListener(new DevilListener());
        jFrame.getContentPane().add(BorderLayout.CENTER, jButton);
        jFrame.setSize(500 , 500);
        jFrame.getContentPane().setBackground(Color.blue);
        jFrame.setVisible(true);
//        System.exit(0);
    }

    class AngleListener implements ActionListener {

        /**
         * 天使的劝说
         * @param e 动作事件
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you might regret it!!");
        }
    }

    class DevilListener implements ActionListener {
        /**
         * 魔鬼的动作
         * @param e 动作事件
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, Let's do it");
        }
    }
}
