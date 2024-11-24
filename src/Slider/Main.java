package Slider;

import javax.swing.event.ChangeEvent;

public class Main {
    public static void main(String[] args) {
        SliderDemo sliderDemo;
        sliderDemo = new SliderDemo() {
            @Override
            public void stateChanged(ChangeEvent e) {
                label.setText(" C"+slider.getValue());
            }
        };
        };
    }