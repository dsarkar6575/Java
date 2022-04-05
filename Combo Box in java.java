package com.gcettb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyFrame extends JFrame implements ActionListener{

    JComboBox comboBox;

    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout((new FlowLayout()));

        String[] animals = {"dog","cat","bird"};                    //int[] num={1,2,3,4,5,6,7,8,9};
         comboBox=new JComboBox(animals);
         comboBox.addActionListener(this);            //For check action...
//        comboBox.setEditable(true);                    //for edit
//        System.out.println(comboBox.getItemCount());   //count the item of combo
//        comboBox.addItem("Horse");
        comboBox.insertItemAt("Tiger",0);
        comboBox.setSelectedIndex(3);                //for select item form start
//        comboBox.removeItem("Bird");         //remove item from combo box
//        comboBox.removeItemAt(0);            //remove Item using index
//        comboBox.removeAllItems();             //remove all Item

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox)
        {
            System.out.println(comboBox.getSelectedItem());
//            System.out.println(comboBox.getSelectedIndex() );
        }

    }
}

public class Main {

    public static void main(String[] args) {
  //JComboBox = A component that combines a button or editable field and a drop-down list

  new MyFrame();

    }
}
