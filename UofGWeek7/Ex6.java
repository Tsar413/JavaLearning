package com.company.javaRelearn.UofGWeek7;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Ex6 extends JFrame {
    public Ex6() {
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
        Font f = new Font("TimesRoman", Font.PLAIN, 24);

        JLabel northLabel = new JLabel();
        northLabel.setText("North");
        northLabel.setFont(f);

        JLabel southLabel = new JLabel();
        southLabel.setText("South");
        southLabel.setFont(f);

        JLabel westLabel = new JLabel();
        westLabel.setText("<html> W <br> E <br> S <br> T </html>");
        westLabel.setFont(f);

        JLabel eastLabel = new JLabel();
        eastLabel.setText("<html> E <br> A <br> S <br> T </html>");
        eastLabel.setFont(f);

        JLabel centerLabel = new JLabel();
        centerLabel.setText("Center");
        centerLabel.setFont(f);

        northPanel.add(northLabel);
        this.add(northPanel, BorderLayout.NORTH);
        northPanel.setBorder(blackLine);

        southPanel.add(southLabel);
        this.add(southPanel, BorderLayout.SOUTH);
        southPanel.setBorder(blackLine);

        westPanel.add(westLabel);
        this.add(westPanel, BorderLayout.WEST);
        westPanel.setLayout(new GridBagLayout());
        westPanel.setBorder(blackLine);

        eastPanel.add(eastLabel);
        this.add(eastPanel, BorderLayout.EAST);
        eastPanel.setLayout(new GridBagLayout());
        eastPanel.setBorder(blackLine);

        centerPanel.add(centerLabel);
        this.add(centerPanel, BorderLayout.CENTER);
        centerPanel.setLayout(new GridBagLayout());
        centerPanel.setBorder(blackLine);

    }

    public static void main(String[] args) {
        Ex6 ex6 = new Ex6();
        ex6.setVisible(true);
    }
}
