package com.gcettb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class MyFrame extends JFrame implements ActionListener{

     JButton button;
     JCheckBox checkBox;
     ImageIcon xicon;
     ImageIcon yicon;

     MyFrame()
     {
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setLayout(new FlowLayout());

         xicon=new ImageIcon("x.png");
         yicon=new ImageIcon("r.jpeg");

          button=new JButton();
         button.setText("Submit");
         button.addActionListener(this);

         checkBox=new JCheckBox();
         checkBox.setText("I'm Not a Robot!!");
         checkBox.setFocusable(false);
         checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
         checkBox.setIcon(xicon);
         checkBox.setSelectedIcon(yicon);

         this.add(checkBox);
         this.add(button);
         this.pack();
         this.setVisible(true);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource()==button){
             System.out.println(checkBox.isSelected());
         }

    }
}

public class Main {

    public static void main(String[] args) {
     //JCheckBox = A GUI component that can be selected or deselected
       MyFrame frame=new MyFrame();


    }
}
