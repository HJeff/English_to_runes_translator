package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    //JFrame is a container. Holds button lists, etc.


    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        frame.getContentPane().add(panel);

        JButton button = new JButton("Button");
        panel.add(button);

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(200, 15));
        panel.add(textField);

        JButton button2 = new JButton ("Second button.");
        panel.add(button2);

        frame.setTitle("LearningJFrame"); //title
        frame.setSize(500,400); //setting window dimension
        frame.setLocationRelativeTo(null); //start location. Null sets to middle of screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //default close action
        frame.setResizable(false);
        frame.setVisible(true);


    }
}
