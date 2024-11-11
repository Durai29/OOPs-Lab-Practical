package Exp10;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class _1One {
    public static void main(String arg[]){
        JFrame frame = new JFrame("Swing Application");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        addComponentsToFrame(frame);

        frame.setVisible(true);
    }
    private static void addComponentsToFrame(JFrame frame){
        JLabel userName = new JLabel("Username");
        userName.setBounds(50,20,100,100);
        userName.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(userName);

        JLabel password = new JLabel("Password");
        password.setBounds(50,70,100,100);
        password.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(password);

        JTextField userNameText = new JTextField(30);
        userNameText.setBounds(150,50,200,30);
        frame.add(userNameText);

        JTextField passwordText = new JTextField(30);
        passwordText.setBounds(150,100,200,30);
        frame.add(passwordText);

        JButton button = new JButton("Login");
        button.setBounds(150,150,70,50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String userText = userNameText.getText();
                String passText = passwordText.getText();
                if(userText.equals("Karunya") && passText.equals("Karunya")){
                    JOptionPane.showMessageDialog(null, "Login Successfull");
                }else{
                    JOptionPane.showMessageDialog(null, "Login Failed");
                }
            }
        });
        frame.add(button);
    }
}
