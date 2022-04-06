package com.gcettb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JLabel label;

    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

         button=new JButton("Pick a color");
        button.addActionListener(this);

        label =new JLabel();
        label.setBackground(Color.white);
        label.setText("This is some text:D");
        label.setFont(new Font("MV Boli",Font.PLAIN,100));
        label.setOpaque(true);

        this.add(label);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
           JColorChooser colorChooser=new JColorChooser();
           Color color=JColorChooser.showDialog(null,"Pick ",Color.pink);
//           label.setForeground(color);
           label.setBackground(color);
        }

    }
}

public class Main {


    public static void main(String[] args) {
   //JColorChooser= A GUI mechanism that let's a user choose a color
   new MyFrame();
    }
}

