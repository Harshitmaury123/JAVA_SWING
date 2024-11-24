package Labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        ImageIcon image=new ImageIcon("dude.png");
        Border border=BorderFactory.createLineBorder(Color.green,3);
        JLabel label=new JLabel();
//        label.setIcon(image);
//        label.setHorizontalTextPosition(JLabel.CENTER);
//        label.setHorizontalTextPosition(JLabel.LEFT);
//        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setText("Bro,do you even code");
        label.setForeground(new Color(0x00ff00));
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setBounds(100,100,250,250);
//        label.setIconTextGap(100);
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(label);
        frame.pack();
    }
}
