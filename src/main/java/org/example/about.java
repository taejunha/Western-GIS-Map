package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.Component;

public class about extends JFrame implements ActionListener {

    JButton back;


    about() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(700, 500);
        this.setTitle("Western Campus Navigation");
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        back = new JButton("Back");
        back.setBounds(290, 400, 100, 40);
        back.addActionListener(this);
        back.setFont(new java.awt.Font("Segoe UI", 0, 12));

        this.add(back);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == back) {
            this.dispose();
            landingPage frame = new landingPage();

        }
    }
}