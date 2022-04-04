package com.gcettb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LanchPage implements ActionListener {
    JFrame frame=new JFrame();
    JButton myButton=new JButton("New button");
    LanchPage(){
        myButton.setBounds(100,150,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(500,500);
     frame.add(myButton);
     frame.setLayout(null);
     frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==myButton)
        {
            NewWindow n=new NewWindow();
        }


    }
}
class NewWindow{

    JFrame frame=new JFrame();
    JLabel label=new JLabel("Hello Bocachoda podu");
    NewWindow()
    {
        label.setBounds(0,0,250,250);
        label.setFont(new Font(null,Font.PLAIN,25));

        frame.add(label);

     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(420,420);
     frame.setLayout(null);
     frame.setVisible(true);
    }
}
public class Main {

    public static void main(String[] args) {
   LanchPage lanchPage=new LanchPage();
    }
}
