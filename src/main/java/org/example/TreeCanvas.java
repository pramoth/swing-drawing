package org.example;

import javax.swing.*;
import java.awt.*;

public class TreeCanvas extends JLabel {
    private Color color = Color.RED;

    @Override
    protected void paintComponent(Graphics g) {
        //EDT Event Dispatching Thread
        //Event loop
        Dimension size = getSize();
        Graphics2D g2  = (Graphics2D) g;
        g2.setColor(Color.GRAY);
        g2.fillRect(0,0,size.width,size.height);
        g2.setColor(color);
        g2.fillOval(size.width/2,0,100,100);
        g2.dispose();
    }

    @Override
    public void update(Graphics g) {
        super.update(g);
        System.out.println("update");
    }

    public void changeNodeColor(Color color) {
        this.color = color;
    }
}
