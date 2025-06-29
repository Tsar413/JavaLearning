package com.company.javaRelearn.UofGWeek7;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BorderPanel extends JPanel {

    private JPanel northPanel;
    private JPanel southPanel;
    private JPanel eastPanel;
    private JPanel westPanel;
    private JPanel centerPanel;

    public BorderPanel() {

        northPanel = new JPanel(new FlowLayout());
        southPanel = new JPanel(new FlowLayout());
        eastPanel = new JPanel(new FlowLayout());
        westPanel = new JPanel(new FlowLayout());
        centerPanel = new JPanel(new FlowLayout());

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

    public JPanel getNorthPanel() {
        return northPanel;
    }

    public JPanel getSouthPanel() {
        return southPanel;
    }

    public JPanel getEastPanel() {
        return eastPanel;
    }

    public JPanel getWestPanel() {
        return westPanel;
    }

    public JPanel getCenterPanel() {
        return centerPanel;
    }

}
