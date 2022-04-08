package com.gcettb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class  Game{
    JFrame frame;
    JLabel label;
    Action UpAction;
    Action DownAction;
    Action LeftAction;
    Action RightAction;

    Game()
    {

        frame=new JFrame("KeyBinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);

        label=new JLabel();
        label.setBackground(Color.red);
        label.setBounds(100,100,100,100);
        label.setOpaque(true);


        UpAction =new UpAction();
        DownAction=new DownAction();
        LeftAction=new LeftAction();
        RightAction=new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke('w'),"UpAction");           //w is Key
        label.getActionMap().put("UpAction",UpAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('s'),"DownAction");
        label.getActionMap().put("DownAction",DownAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('a'),"LeftAction");
        label.getActionMap().put("LeftAction",LeftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('d'),"RightAction");
        label.getActionMap().put("RightAction",RightAction);


        frame.add(label);
        frame.setVisible(true);
    }
    public class UpAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY()-10);

        }
    }
    public class DownAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY()+10);

        }
    }
    public  class LeftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-10,label.getY());
        }
    }
    public class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+10,label.getY());
        }
    }
}

public class Main {


    public static void main(String[] args) {
   //Key Bindings = Bind an Action to a KeyStroke
        //don't require you to click a component to give it focus
        //all swing components use Key Bindings
        //increased flexibility compared to KeyListeners
        //can assign key strokes to individual Swing components
        //more difficult to utilize and set up:(
         Game game=new Game();

    }
}
