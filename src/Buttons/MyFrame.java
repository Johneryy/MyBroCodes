package Buttons;

import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame() {
        ImageIcon icon1 = new ImageIcon("point.png");
        ImageIcon icon2 = new ImageIcon("face.png");

        button = new JButton();
        button.setBounds(100,100,200,100);
        button.setText("Click");
        button.addActionListener(this);
        button.setFocusable(false);
        button.setIcon(icon1);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Georgia", Font.BOLD,35));
        button.setIconTextGap(-15);
        button.setForeground(Color.RED);
        button.setBackground(Color.BLACK);
        button.setBorder(BorderFactory.createEtchedBorder());

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            label.setVisible(true);
            button.setEnabled(true);
        }
    }
}
