package com.gcettb;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
       //JPanel = a GUI component that functions as a container to hold other components
       ImageIcon icon=new ImageIcon("pu.png");


        JLabel label=new JLabel();
       label.setText("HELLO");
       label.setIcon(icon);
       label.setVerticalAlignment(JLabel.BOTTOM);
       label.setHorizontalAlignment(JLabel.RIGHT);
       label.setBounds(100,10 ,75,75);

        JPanel rpanel=new JPanel();
       rpanel.setBackground(Color.red);
       rpanel.setBounds(0,0,250,250);
        rpanel.setLayout(null);

        JPanel bpanel=new JPanel();
        bpanel.setBackground(Color.blue);
        bpanel.setBounds(250,0,250,250);
        bpanel.setLayout(null);

        JPanel gpanel=new JPanel();
        gpanel.setBackground(Color.green);
        gpanel.setBounds(0,250,500,250);
        gpanel.setLayout(null);



        JFrame frame=new JFrame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLayout(null);
         frame.setSize(750,750);
         frame.setVisible(true);
        // rpanel.add(label);
          gpanel.add(label);
         frame.add(rpanel);
         frame.add(bpanel);
         frame.add(gpanel);
    }
}
