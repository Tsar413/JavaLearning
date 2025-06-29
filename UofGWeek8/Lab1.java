package com.company.javaRelearn.UofGWeek8;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Lab1 extends JFrame {
    public Lab1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocation(100,100);
        setTitle("Week8 Lab1");

        JPanel panel1 = new JPanel(new FlowLayout());
        JPanel panel2 = new JPanel(new FlowLayout());
        JPanel panel3 = new JPanel(new FlowLayout());

        JFrame jFrame = new JFrame();
        jFrame.setLayout(null);

        Border blackLine = BorderFactory.createLineBorder(Color.BLACK);
        Font f = new Font("TimesRoman", Font.PLAIN, 24);

        panel1.setBorder(blackLine);
        jFrame.add(panel1, BorderLayout.CENTER);
        panel1.setLayout(new GridBagLayout());
        panel1.setBackground(Color.BLUE);

        panel2.setBorder(blackLine);
        panel2.setSize(50,50);
        panel2.setLocation(100,50);
        jFrame.add(panel2);
        panel2.setBackground(Color.CYAN);
    }

    public static void main(String[] args) {
        Lab1 lab1 = new Lab1();
        lab1.setVisible(true);
    }
}
