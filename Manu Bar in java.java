package com.gcettb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

class MyFrame extends JFrame implements ActionListener{

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editManu;
    JMenu helpMenu;
    JMenu printMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon ficon;
    ImageIcon sicon;
    ImageIcon eicon;

    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        ficon=new ImageIcon("f.png");
        sicon=new ImageIcon("s.png");
        eicon=new ImageIcon("e.png");

         menuBar=new JMenuBar();
         fileMenu=new JMenu("File");
         editManu=new JMenu("Edit");
         helpMenu=new JMenu("Help");
         printMenu=new JMenu("Print");

         loadItem=new JMenuItem("Load");
         saveItem=new JMenuItem("Save");
        exitItem=new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(ficon);
        saveItem.setIcon(sicon);
        exitItem.setIcon(eicon);

        fileMenu.setMnemonic(KeyEvent.VK_F);    //alt+f for file
        editManu.setMnemonic(KeyEvent.VK_E);     //alt+e for edit
        helpMenu.setMnemonic(KeyEvent.VK_H);     //alt+h for Help
        printMenu.setMnemonic(KeyEvent.VK_P);    //alt+p for print
        loadItem.setMnemonic(KeyEvent.VK_L);    //l for load
        saveItem.setMnemonic(KeyEvent.VK_S);     //s for save
        exitItem.setMnemonic(KeyEvent.VK_E);     //e for exit


        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editManu);
        menuBar.add(helpMenu);
        menuBar.add(printMenu);


        this.add(menuBar);
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loadItem)
        {
            System.out.println("You loaded a file");
        }
       else if(e.getSource()==saveItem)
        {
            System.out.println("You save a file");
        }
      else if(e.getSource()==exitItem)
        {
            System.out.println("You are Exit");
           System.exit(0);                     //For exit the frame
        }

    }
}
public class Main {

    public static void main(String[] args) {
     //
        new MyFrame();
    }
}
