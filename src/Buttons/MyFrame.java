package Buttons;

import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    JButton button;
    JLabel label;
    MyFrame() {
        ImageIcon icon = new ImageIcon("point.png");

        button = new JButton();
        button.setBounds(100,100,200,100);
        button.addActionListener(e -> System.out.println("I created this"));
        button.setText("Click");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Georgia", Font.BOLD,35));
        button.setIconTextGap(-15);
        button.setForeground(Color.RED);
        button.setBackground(Color.BLACK);

        label = new JLabel();


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }
}
