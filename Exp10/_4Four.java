package Exp10;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;

import javax.swing.*;

public class _4Four {
    public static void main(String arg[]){
        JFrame frame = new JFrame("COMBO LIST");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.PINK);

        addComponents(frame);

        frame.setVisible(true);
    }
    private static void addComponents(JFrame frame){
        JLabel subject = new JLabel("SELECT SUBJECT: ");
        subject.setFont(new Font("Arial",Font.PLAIN,16));
        subject.setBounds(50,50,200,50);
        frame.add(subject);

        JLabel name = new JLabel("SUBJECT NAME: ");
        name.setFont(new Font("Arial",Font.PLAIN,16));
        name.setBounds(50,150,200,50);
        frame.add(name);

        JComboBox<String>choicelist = new JComboBox<>(new String[]{"Data Management System","Java","Python"});
        choicelist.setBounds(200,50,250,50);
        frame.add(choicelist);

        JTextField text = new JTextField(50);
        text.setBounds(200,150,250,40);
        frame.add(text);

        choicelist.addItemListener(e ->{
            if(e.getStateChange()==ItemEvent.SELECTED){
                text.setText((String)choicelist.getSelectedItem());
            }
        });
    }
}
