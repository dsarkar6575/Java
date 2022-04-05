package com.gcettb;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JTextField textField;
    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

         button=new JButton("Submit");
        button.addActionListener(this);

        textField=new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.PLAIN,35));     //Change the text font of textfield.
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.WHITE);
        textField.setText("username");



        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button)
        {
            System.out.println("Wellcome  "+ textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);
        }

    }
}

public class Main {

    public static void main(String[] args) {
//JTextField = A GUI textbox component that can be used to add, set,or get text
     MyFrame frame=new MyFrame();



    }
}
