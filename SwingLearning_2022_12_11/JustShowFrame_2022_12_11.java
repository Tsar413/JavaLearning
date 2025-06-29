package com.company.javaRelearn.SwingLearning_2022_12_11;

import javax.swing.*;
import java.awt.*;

public class JustShowFrame_2022_12_11 extends JFrame {
    private JButton button1, button2;
    private JTextField textField1;
    private JLabel label1;

    public JustShowFrame_2022_12_11() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setLocation(100,100);
        setTitle("GUI Table");

        button1 = new JButton("Ok");
        button2 = new JButton("Quit");
        textField1 = new JTextField("initial Text", 15);
        label1 = new JLabel("Click a button");

        JPanel mainPanel = new JPanel(new GridLayout(2, 1));
        JPanel myPanel1 = new JPanel(new FlowLayout());

        myPanel1.add(button1);
        myPanel1.add(button2);
        myPanel1.add(label1);
        mainPanel.add(myPanel1);

        JPanel myPanel2 = new JPanel(new FlowLayout());
        myPanel2.add(label1);
        myPanel2.add(textField1);

        mainPanel.add(myPanel2);

        this.add(mainPanel);

    }

    public static void main(String[] args) {
        JustShowFrame_2022_12_11 frame = new JustShowFrame_2022_12_11();
        frame.setVisible(true);
    }
}
