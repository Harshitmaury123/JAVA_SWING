package Buttons;

import Frames.MyFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    Buttons(){
        label=new JLabel();
        label.setBounds(150,250,150,150);
        label.setVisible(false);
        label.setText("HII!!");
        button =new JButton();
        button.setText("I'm button!");
        button.setFocusable(false);
        button.setBounds(200,100,100,50);
        button.addActionListener(this);
        button.setFont(new Font("Comic Sans", Font.BOLD,25));
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button){
//           System.out.println("poo");
//           button.setEnabled(false);
           label.setVisible(true);
       }
    }
}
