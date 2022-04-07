package com.gcettb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MyFrame extends JFrame {
DragPanel dragPanel=new DragPanel();

    MyFrame() {

        this.setTitle("Drag & Drop demo");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(dragPanel);
    }
}
 class DragPanel extends JPanel{
    ImageIcon image=new ImageIcon("sm.png");
  final  int WIDTH=image.getIconWidth();
    final int HEIGHT =image.getIconHeight();
    Point imageCorner;
    Point prevPt;
    DragPanel()
    {
  imageCorner=new Point(0,0);
  ClickListener clickListener=new ClickListener();
  DragListener dragListener=new DragListener();
  this.addMouseListener(clickListener);
  this.addMouseMotionListener(dragListener);

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        image.paintIcon(this,g,(int)imageCorner.getX(),(int)imageCorner.getY());

    }
    private class  ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e)                                         //click the image
        {
            prevPt=e.getPoint();
        }

    }
    private class  DragListener extends MouseAdapter{
        public void mouseDragged(MouseEvent e)                                         //drag the image
        {
            Point currentPt=e.getPoint();
            imageCorner.translate(
                    (int)(currentPt.getX() - prevPt.getX()),
                    (int)(currentPt.getY() - prevPt.getY())
            );
            prevPt=currentPt;
            repaint();

        }
    }

}


public class Main {

    public static void main(String[] args) {
   //JColorChooser= A GUI mechanism that let's a user choose a color
  MyFrame frame=new MyFrame();

    }
}
