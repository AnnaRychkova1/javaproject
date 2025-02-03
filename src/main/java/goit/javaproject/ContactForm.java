/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package goit.javaproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author aanyt
 */
public class ContactForm extends JFrame{
    private JTextField name_field, email_field;
    private JRadioButton male, female;
    private JCheckBox checkBox;

    public ContactForm() {
        super("Contact form");
        super.setBounds(200, 200, 350, 180);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5, 2, 2, 10));

        JLabel name = new JLabel("Input your name:");
        name_field = new JTextField("", 1);

        JLabel email = new JLabel("Input your email:");
        email_field = new JTextField("", 1);

        container.add(name);
        container.add(name_field);
        container.add(email);
        container.add(email_field);

        male = new JRadioButton("Man");
        female = new JRadioButton("Woman");

        male.setSelected(true);
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        container.add(male);
        container.add(female);

        checkBox = new JCheckBox("Agree?", true);
        container.add(checkBox);

        JButton btn = new JButton("Enter");
        container.add(btn);

        btn.addActionListener(new ButtonEventManager());

    }

    class ButtonEventManager implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           String name =  name_field.getText();
           String email =  email_field.getText();

           String isMale = "Man";
           if(!male.isSelected())
               isMale = "Woman";

           boolean isCheck = checkBox.isSelected();

           JOptionPane.showMessageDialog(null, "Your email: " + email + "\nYou: " + isMale + "\nYou agree? " + isCheck,  "Hello, " + name, JOptionPane.PLAIN_MESSAGE);
        }
    }

}
