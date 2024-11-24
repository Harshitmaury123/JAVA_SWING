package RadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizza;
    JRadioButton burger;
    JRadioButton hotdog;
    ButtonGroup group;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        pizza=new JRadioButton("pizza");
        burger=new JRadioButton("burger");
        hotdog=new JRadioButton("hotdog");
        group=new ButtonGroup();
        group.add(pizza);
        group.add(burger);
        group.add(hotdog);

       pizza.addActionListener(this);
       burger.addActionListener(this);
       hotdog.addActionListener(this);

        this.add(pizza);
        this.add(burger);
        this.add(hotdog);
        this.setVisible(true);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==pizza){
          System.out.println("You ordered pizza!");
      }
      else if(e.getSource()==burger){
          System.out.println("You ordered a burger");
      }
      else if(e.getSource()==hotdog){
          System.out.println("You ordered a hotdog");
      }
    }
}