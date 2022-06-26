package Buttons;

import javax.swing.JButton;
import javax.swing.*;

public class MyFrame extends JFrame {
    JButton button;
    MyFrame() {
        ImageIcon icon = new ImageIcon("point.png");

        button = new JButton();
        button.setBounds(100,100,100,100);
        button.addActionListener(e -> System.out.println("I created this"));
        button.setText("Click");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }
}
