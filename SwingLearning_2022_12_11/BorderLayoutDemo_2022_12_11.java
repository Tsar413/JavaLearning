package com.company.javaRelearn.SwingLearning_2022_12_11;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo_2022_12_11 extends JFrame {
    private JButton jButton1;
    private JButton jButton2;

    public BorderLayoutDemo_2022_12_11() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setLocation(100,100);
        setTitle("GUI Table");

        jButton1 = new JButton("Press Me");
        jButton2 = new JButton("Press Me Too");

        this.setLayout(new BorderLayout());
        this.add(jButton1,BorderLayout.CENTER);
        this.add(jButton2,BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        BorderLayoutDemo_2022_12_11 border = new BorderLayoutDemo_2022_12_11();
        border.setVisible(true);
    }
}
