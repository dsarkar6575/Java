package com.gcettb;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

class SliderDemo implements ChangeListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    SliderDemo(){
        frame=new JFrame("Slider demo");
        panel=new JPanel();
        label=new JLabel();
        slider=new JSlider(0,100,50);

        slider.setPreferredSize(new Dimension(400,200 ));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(25);          //that is spacing different

        slider.setPaintLabels(true);              //print all labels
         slider.setFont(new Font("MV Boli",Font.PLAIN,20));

         label.setFont(new Font("MV Boli",Font.PLAIN,40));

//        slider.setOrientation(SwingConstants.HORIZONTAL);
        slider.setOrientation(SwingConstants.VERTICAL);                //That is the orientation


        slider.addChangeListener(this);





        panel.add(slider);
        panel.add(label);


        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);


    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText(" C ="  +slider.getValue());
    }
}
public class Main {

    public static void main(String[] args) {
//JSlider = GUI component that lets user enter a value by using an adjustable sliding knob on a track
     SliderDemo sd=new SliderDemo();

    }
}
