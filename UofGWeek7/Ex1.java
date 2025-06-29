package com.company.javaRelearn.UofGWeek7;

import javax.swing.*;
import java.awt.*;

public class Ex1 extends JFrame {
    public Ex1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocation(100,100);
        setTitle("Border layout for JFrame");

        JPanel northPanel = new JPanel(new FlowLayout());
        JPanel southPanel = new JPanel(new FlowLayout());
        JPanel eastPanel = new JPanel(new FlowLayout());
        JPanel westPanel = new JPanel(new FlowLayout());
        JPanel centerPanel = new JPanel(new FlowLayout());

        northPanel.add(new JLabel("North"));
        this.add(northPanel, BorderLayout.NORTH);
        southPanel.add(new JLabel("South"));
        this.add(southPanel, BorderLayout.SOUTH);
        westPanel.add(new JLabel("North"));
        this.add(westPanel, BorderLayout.WEST);
        eastPanel.add(new JLabel("North"));
        this.add(eastPanel, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        ex1.setVisible(true);
    }
}
