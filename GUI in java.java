  package com.gcettb;

  import javax.swing.*;
  import java.awt.*;
  class MyFrame extends JFrame{
    MyFrame()
    {
      //JFrame = a GUI window to add components to

      this.setTitle("JFrame title Dipankar");  //sets title of frame
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setResizable(true);//prevent frame from being resized
      this.setSize(420,420); //sets the x-dimension,and y-dimension of frame
      this.setVisible(true); //make frame visible
      ImageIcon image=new ImageIcon("i.jpg");// create an ImageIcon
      this.setIconImage(image.getImage());  //change icon of frame
      this.getContentPane().setBackground(Color.blue); //change the background color(new color(255,255,255) using color value
    }
  }

  public class Main {

    public static void main(String[] args) {
//       //JFrame = a GUI window to add components to
//
//      JFrame frame=new JFrame();   //creates a frame
//      frame.setTitle("JFrame title Dipankar");  //sets title of frame
//      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      frame.setResizable(true);//prevent frame from being resized
//      frame.setSize(420,420); //sets the x-dimension,and y-dimension of frame
//      frame.setVisible(true); //make frame visible
//      ImageIcon image=new ImageIcon("i.jpg");// create an ImageIcon
//      frame.setIconImage(image.getImage());  //change icon of frame
//      frame.getContentPane().setBackground(Color.blue); //change the background color(new color(255,255,255) using color value
         MyFrame frame=new MyFrame();

       }
    }
