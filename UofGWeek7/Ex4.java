package com.company.javaRelearn.UofGWeek7;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Ex4 extends JFrame {
    public Ex4() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocation(100,100);
        setTitle("Border layout for JFrame");

        JPanel northPanel = new JPanel(new FlowLayout());
        JPanel southPanel = new JPanel(new FlowLayout());
        JPanel eastPanel = new JPanel(new FlowLayout());
        JPanel westPanel = new JPanel(new FlowLayout());
        JPanel centerPanel = new JPanel(new FlowLayout());

        Border blackLine = BorderFactory.createLineBorder(Color.BLACK);

        northPanel.add(new JLabel("North"));
        this.add(northPanel, BorderLayout.NORTH);
        northPanel.setBorder(blackLine);
        southPanel.add(new JLabel("South"));
        this.add(southPanel, BorderLayout.SOUTH);
        southPanel.setBorder(blackLine);
        westPanel.add(new JLabel("West"));
        this.add(westPanel, BorderLayout.WEST);
        westPanel.setLayout(new GridBagLayout());
        westPanel.setBorder(blackLine);
        eastPanel.add(new JLabel("East"));
        this.add(eastPanel, BorderLayout.EAST);
        eastPanel.setLayout(new GridBagLayout());
        eastPanel.setBorder(blackLine);
        centerPanel.add(new JLabel("Center"));
        this.add(centerPanel, BorderLayout.CENTER);
        centerPanel.setLayout(new GridBagLayout());
        centerPanel.setBorder(blackLine);
    }

    public static void main(String[] args) {
        Ex4 ex4 = new Ex4();
        ex4.setVisible(true);
    }
}
