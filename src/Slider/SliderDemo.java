package Slider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public abstract class SliderDemo implements ChangeListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo(){
        frame=new JFrame("Slider Demo");
        panel=new JPanel();
        label =new JLabel();
        slider =new JSlider(0,100,50);
         slider.setPreferredSize(new Dimension(400,200));
         slider.setPaintTicks(true);
         slider.setMinorTickSpacing(10);
         slider.setPaintTicks(true);
         slider.setMajorTickSpacing(25);
         slider.setPaintLabels(true);
         slider.addChangeListener(this);

         slider.setFont(new Font("MV Boli",Font.PLAIN,15));
        label.setFont(new Font("MV Boli",Font.PLAIN,15));

        slider.setOrientation(SwingConstants.VERTICAL);
//         slider.setOrientation(SwingConstants.HORIZONTAL);
         label.setText("C ="+slider.getValue());
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(420,420);

    }
}
