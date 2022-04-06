package com.gcettb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


class MyFrame extends JFrame implements KeyListener {
    JButton button;
    JLabel label;
    ImageIcon icon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);

        icon=new ImageIcon("download.jpg");

        label=new JLabel();
        label.setBounds(0,25,250,200);
//        label.setBackground(Color.RED);
        label.setIcon(icon);
        label.setOpaque(true);

        this.add(label);
        this.getContentPane().setBackground(Color.BLACK );
        this.addKeyListener(this);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //KeyTyped = Invoked when a key is typed.Uses KeyChar,char output

//        switch (e.getKeyChar())
//        {
//            case  'a': label.setLocation(label.getX()-1,label.getY());
//            break;
//            case  'w': label.setLocation(label.getX(),label.getY()-1);
//                break;
//            case  's': label.setLocation(label.getX(),label.getY()+1);
//                break;
//            case  'd': label.setLocation(label.getX()+1,label.getY());
//                break;
//        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //KeyPressed = Invoked when a physical key is pressed down. Uses keyCode, int output
        switch (e.getKeyCode())
        {
            case  37: label.setLocation(label.getX()-10,label.getY());
                break;
            case  38: label.setLocation(label.getX(),label.getY()-10);
                break;
            case  39: label.setLocation(label.getX()+10,label.getY());
                break;
            case  40: label.setLocation(label.getX(),label.getY()+10);
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //KeyReleased = called whenever a button is released.
        System.out.println("You released key char: "+e.getKeyChar());
        System.out.println("You released key code: "+e.getKeyCode());

    }
}

public class Main {


    public static void main(String[] args) {
   //JColorChooser= A GUI mechanism that let's a user choose a color
   new MyFrame();
    }
}

