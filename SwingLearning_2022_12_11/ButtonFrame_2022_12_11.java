package com.company.javaRelearn.SwingLearning_2022_12_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame_2022_12_11 extends JFrame implements ActionListener {
    private JButton jButton1;
    private JButton jButton2;

    public ButtonFrame_2022_12_11() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setLocation(100,100);
        setTitle("GUI Table");

        jButton1 = new JButton("Click me");
        jButton2 = new JButton("Click me");

        jButton1.addActionListener(this);

        JPanel jPanel = new JPanel(new GridLayout(1,2));
        jPanel.add(jButton1);
        jPanel.add(jButton2);

        this.add(jPanel);
    }

    public static void main(String[] args) {
        ButtonFrame_2022_12_11 buttonFrame = new ButtonFrame_2022_12_11();
        buttonFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jButton1.setText("I was clicked.");
    }
}
