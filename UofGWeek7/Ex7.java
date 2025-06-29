package com.company.javaRelearn.UofGWeek7;

import javax.swing.*;

public class Ex7 extends JFrame {
    private BorderPanel myPanel;

    public Ex7() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocation(100,100);
        setTitle("Border layout for JFrame");

        myPanel = new BorderPanel();
        this.add(myPanel);
    }

    public static void main(String[] args) {
        Ex7 ex7 = new Ex7();
        ex7.setVisible(true);
    }
}
