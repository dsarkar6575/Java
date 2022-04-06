package com.gcettb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


class MyFrame extends JFrame implements MouseListener {
    JButton button;
    JLabel label;
    ImageIcon smile;
    ImageIcon narvous;
    ImageIcon pain;
    ImageIcon dizzy;


    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);

        smile =new ImageIcon("sm.png");
        narvous=new ImageIcon("nv.png");
        pain=new ImageIcon("pn.jpeg");
        dizzy=new ImageIcon("dis.jpeg");





        label=new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Invoked when the mouse button has been clicked (pressed and released) on a component
//        System.out.println("You click the mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //Invoked when a mouse button has been pressed on a component
        System.out.println("You passed the mouse");
//        label.setBackground(Color.YELLOW);
        label.setIcon(narvous);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //Invoked when a mouse button has been released on a component
        System.out.println("You released the mouse");
//        label.setBackground(Color.GREEN);
        label.setIcon(pain);


    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //Invoked when the mouse enters a component
        System.out.println("You entered the component");
//        label.setBackground(Color.BLUE);
        label.setIcon(dizzy);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        //Invoked when the mouse exits a component
//        label.setBackground(Color.RED);
        label.setIcon(smile);

    }
}


public class Main {

    public static void main(String[] args) {
   //JColorChooser= A GUI mechanism that let's a user choose a color
   new MyFrame();

    }
}
