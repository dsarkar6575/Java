package com.gcettb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class MyFrame extends JFrame implements ActionListener{
    JButton button;

    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

         button=new JButton("Select File");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button)
        {
             JFileChooser fileChooser=new JFileChooser();

             fileChooser.setCurrentDirectory(new File("C:\\Users\\Dipankar\\Desktop\\New folder"));
//             int response=fileChooser.showOpenDialog(null);    //select file to open
            int response=fileChooser.showSaveDialog(null);   //select file to save
        if(response==JFileChooser.APPROVE_OPTION){
            File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
            System.out.println(file);
             }

        }
    }
}

public class Main {


    public static void main(String[] args) {
   //JFileChooser = A GUI mechanism that let's a user choose a file(help open or saving files)
   new MyFrame();
    }
}

