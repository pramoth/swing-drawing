package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        TreeCanvas treeCanvas = new TreeCanvas();
        JPanel top = new JPanel();
        top.setLayout(new FlowLayout());
        JTextField textField = new JTextField("set value here.");
        top.add(textField);
        JButton addButton  = new JButton("Add");
        addButton.addActionListener(e -> {
            System.out.println(textField.getText());
            treeCanvas.changeNodeColor(Color.GREEN);
            //add no to tree
           treeCanvas.repaint();
        });
        top.add(addButton);
        JFrame frame = new JFrame("Hello");
        frame.setLayout(new BorderLayout());
        frame.getContentPane().add(top,BorderLayout.NORTH);
        frame.getContentPane().add(treeCanvas,BorderLayout.CENTER);
        frame.setSize(1000,1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
