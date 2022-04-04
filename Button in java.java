package com.gcettb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class  MyFrame extends JFrame implements ActionListener
{
    JButton button;
    JLabel label;
    MyFrame()
    {
        ImageIcon icon=new ImageIcon("like.jpg");
        ImageIcon icon1=new ImageIcon("pu.png");

         label=new JLabel();
         label.setIcon(icon1);
         label.setBounds(500,0,500,500);
         label.setVisible(false);





        button=new JButton();
        button.setBounds(0,0,500,500);           //button size
        button.addActionListener(this);        //action litioner either  e -> System.out.println("Dipankar") will be use
        button.setText("I am a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());





        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button)
        {
//            System.out.println("Dipankar");
 //           button.setEnabled(false);          //click one time then Enables the key....
            label.setVisible(true);
        }
    }
}


public class Main {

    public static void main(String[] args) {
      //JButton = a button that performs an action when clicked on
        MyFrame frame=new MyFrame();

    }
}
