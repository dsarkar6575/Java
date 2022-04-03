package com.gcettb;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// JLabel = a GUI display area for a string of text, an image, or both
        ImageIcon image=new ImageIcon("pu.png");

        Border border=BorderFactory.createLineBorder(Color.blue);

        JLabel label=new JLabel();  //create a label
        label.setText("Bro, do you even code?"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER,RIGHT OF IMAGEICON
        label.setVerticalTextPosition( JLabel.TOP);  //set text Top,CENTER,BOTTOM of imageicon
        label.setForeground(new Color(0x00FF00));//SET FONT COLOR
        label.setFont(new Font("MV Boli",Font.PLAIN,20));//SET FONT OF TEXT
        label.setIconTextGap(25);   //set gap of text ro image
        label.setBackground(Color.black);//set background color
        label.setOpaque(true);    //display background color
        label.setBorder(border);//display border
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon+text within label
        //label.setBounds(100,0,350,250);//set x,y position within frame as well as dimensions

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500,500);
//        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
