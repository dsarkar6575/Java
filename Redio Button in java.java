package com.gcettb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class MyFrame extends JFrame implements ActionListener{

     JRadioButton Pizza;
     JRadioButton Bargar;
     JRadioButton Hotdog;
     ImageIcon picon;
     ImageIcon bicon;
     ImageIcon hicon;

     MyFrame()
     {
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setLayout(new FlowLayout());

         Pizza=new JRadioButton("Pizza");
         Bargar=new JRadioButton("Bargar");
          Hotdog=new JRadioButton("Hotdog");

          picon=new ImageIcon("p.jpeg");
          bicon=new ImageIcon("b.jpeg");
          hicon=new ImageIcon("h.jpeg");

         ButtonGroup group=new ButtonGroup();
         group.add(Pizza);
         group.add(Bargar);
         group.add(Hotdog);

         Pizza.addActionListener(this);
         Bargar.addActionListener(this);
         Hotdog.addActionListener(this);

         Pizza.setIcon(picon);
         Bargar.setIcon(bicon);
         Hotdog.setIcon(hicon);


          this.add(Pizza);
          this.add(Bargar);
          this.add(Hotdog);
         this.pack();
         this.setVisible(true);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==Pizza)
         {
             System.out.println("You ordered pizza.");
         }
         else if(e.getSource()==Bargar)
         {
             System.out.println("You ordered Bargar");
         }
         else if(e.getSource()==Hotdog)
         {
             System.out.println("You ordered Hotdog.");
         }

    }
}

public class Main {

    public static void main(String[] args) {
     //JRedioButton =One or more buttons in a grouping in which only 1 may be selected per group
      new MyFrame();


    }
}
