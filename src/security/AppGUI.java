/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Platform.exit;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static security.Cipher.decrypt;
import static security.Cipher.doDecryption;
import static security.Cipher.doEncryption;
import static security.Cipher.encrypt;

/**
 *
 * @author Youssef Sultan
 */
public class AppGUI extends JFrame implements ActionListener {

    static void AppGUI() throws IOException {
        AppGUI x = new AppGUI();

    }

    JLabel l1, l2, l3, l4, l5, l6, l7, credits;
    JTextField plaintext, cencryption, cdecryption, mdecryption, mencryption;
    JTextField cipher, offset;
    JButton b1, b2, b3;
    JPanel p1, p2, p3, p4;
    Choice c1;
    JLabel lx;

    AppGUI() throws IOException {

        setTitle("Caesar and Monoalphabetic Ciphers");

        setLayout(null);

        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        l1 = new JLabel("Plain Text");
        l1.setBounds(20, 20, 100, 20);
        add(l1);
        l2 = new JLabel("Cipher");
        l2.setBounds(300, 20, 100, 20);
        add(l2);

        l3 = new JLabel("Caeser Encryption");
        l3.setBounds(20, 100, 130, 20);
        add(l3);
        l4 = new JLabel("Mono Encryption");
        l4.setBounds(20, 60, 100, 20);
        add(l4);

        l5 = new JLabel("Caeser Decryption");
        l5.setBounds(300, 100, 130, 20);
        add(l5);
        l6 = new JLabel("Mono Decryption");
        l6.setBounds(300, 60, 100, 20);
        add(l6);
        l7 = new JLabel("Caeser Key/Offset");
        l7.setBounds(20, 140, 130, 20);
        add(l7);

        credits = new JLabel("Youssef Mohamed Mohamed Soltan 2019/11385");
        credits.setFont(new Font("Verdana", Font.PLAIN, 18));
        credits.setBounds(80, 320, 580, 20);
        add(credits);

        plaintext = new JTextField(15);
        plaintext.setBounds(130, 20, 150, 20);
        add(plaintext);

        mencryption = new JTextField(155);
        mencryption.setBounds(130, 60, 150, 20);
        mencryption.setEditable(false);
        add(mencryption);

        cencryption = new JTextField(155);
        cencryption.setBounds(130, 100, 150, 20);
        cencryption.setEditable(false);
        add(cencryption);

        offset = new JTextField("4");
        offset.setBounds(130, 140, 150, 20);

        add(offset);

        cipher = new JTextField(15);
        cipher.setBounds(415, 20, 150, 20);
        add(cipher);

        mdecryption = new JTextField(155);
        mdecryption.setBounds(415, 60, 150, 20);
        mdecryption.setEditable(false);
        add(mdecryption);

        cdecryption = new JTextField("");
        cdecryption.setBounds(415, 100, 150, 20);
        cdecryption.setEditable(false);
        add(cdecryption);

        ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("icon/ecrypt.jpg"));
        Image i1 = ic1.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        b1 = new JButton("Encrypt", new ImageIcon(i1));
        b1.setBounds(30, 180, 120, 100);
        add(b1);

        ImageIcon ic2 = new ImageIcon(ClassLoader.getSystemResource("icon/decrypt1.jpg"));
        Image i2 = ic2.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        b2 = new JButton("Decrypt", new ImageIcon(i2));
        b2.setBounds(350, 180, 120, 100);
        add(b2);

        ImageIcon ic3 = new ImageIcon(ClassLoader.getSystemResource("icon/cancel.jpg"));
        Image i3 = ic3.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        b3 = new JButton("Exit", new ImageIcon(i3));
        b3.setBounds(200, 380, 100, 60);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setLayout(new BorderLayout());

        setSize(600, 500);
        setLocation(600, 300);
        setVisible(true);
        setResizable(false);

        setLayout(new BorderLayout());

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String Offset = offset.getText();

            String Plaintext = plaintext.getText();
            String lowercase = Plaintext.toLowerCase();
            int intoffset = Integer.parseInt(Offset);

            cencryption.setText(encrypt(lowercase, intoffset).toUpperCase());
            mencryption.setText(doEncryption(lowercase).toUpperCase());

        } else if (ae.getSource() == b2) {

            String Cipher = cipher.getText();
            String Cipheruppercase = Cipher.toUpperCase();
            String Offset = offset.getText();
            int intoffset = Integer.parseInt(Offset);

            cdecryption.setText(decrypt(Cipheruppercase, intoffset).toUpperCase());
            mdecryption.setText(doDecryption(Cipheruppercase).toUpperCase());

        } else if (ae.getSource() == b3) {
            System.exit(0);

        }
    }
}
