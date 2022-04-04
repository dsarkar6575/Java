package com.gcettb;


import javax.swing.*;

public class Main {

    public static void main(String[] args) {
      //JOptionPane = pop up a standard dialog box that prompts users for a value or informs them of something.
//        JOptionPane.showMessageDialog(null,"This is some uselesss information","title",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Here is more useless information","title",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Really?","title",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"You're Computer has A VIRUS!!!","title",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Call tech Supports NOW OR ELSE!!!","title",JOptionPane.ERROR_MESSAGE);
        //   int answar= JOptionPane.showConfirmDialog(null,"You are GOOD or Not?","This is my title",JOptionPane.YES_NO_CANCEL_OPTION);
    //String name=JOptionPane.showInputDialog("What is your name?:");
        String[] responses={"No, you are awesome!","Thank You","**Blush**"};
        ImageIcon icon=new ImageIcon("download.jpg");
    JOptionPane.showOptionDialog(null,"You are awesome!",
            "secret message",JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            icon,responses,0);



    }
}
