package com.company.javaRelearn.UofGWeek7;

import javax.swing.*;
import java.awt.*;

public class Ex3 extends JFrame {
    public Ex3() {
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
        westPanel.add(new JLabel("West"));
        this.add(westPanel, BorderLayout.WEST);
        westPanel.setLayout(new GridBagLayout());
        eastPanel.add(new JLabel("East"));
        this.add(eastPanel, BorderLayout.EAST);
        eastPanel.setLayout(new GridBagLayout());
        centerPanel.add(new JLabel("Center"));
        this.add(centerPanel, BorderLayout.CENTER);
        centerPanel.setLayout(new GridBagLayout());
    }

    public static void main(String[] args) {
        Ex3 ex3 = new Ex3();
        ex3.setVisible(true);
    }
}
