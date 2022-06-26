package Buttons;

import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    JButton button;
    JLabel label;
    MyFrame() {
        ImageIcon icon1 = new ImageIcon("point.png");
        ImageIcon icon2 = new ImageIcon("face.png");

        button = new JButton();
        button.setBounds(100,100,200,100);
        button.addActionListener(e -> System.out.println("I created this"));
        button.setText("Click");
        button.setFocusable(false);
        button.setIcon(icon1);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Georgia", Font.BOLD,35));
        button.setIconTextGap(-15);
        button.setForeground(Color.RED);
        button.setBackground(Color.BLACK);


        label = new JLabel();

        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
        label.setVisible(true);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);

    }
}
