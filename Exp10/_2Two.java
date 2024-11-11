package Exp10;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class _2Two {
    public static void main(String arg[]){
        JFrame frame = new JFrame("Yes No Close");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500,300);

        addComponents(frame);

        frame.setVisible(true);
    }
    private static void addComponents(JFrame frame){
        JLabel label = new JLabel("");
        label.setBounds(20,200,300,50);
        frame.add(label);

        JButton yesButton = new JButton("Yes");
        yesButton.setBounds(0,0,500,50);
        frame.add(yesButton);

        JButton nobButton = new JButton("No");
        nobButton.setBounds(0,50,500,50);
        frame.add(nobButton);

        JButton closeButton = new JButton("Close");
        closeButton.setBounds(0,100,500,50);
        frame.add(closeButton);

        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                label.setText("Yes Button has been pressed");
            }
        });
        
        nobButton.addActionListener(e -> label.setText("No Button has been pressed"));

        closeButton.addActionListener(e -> System.exit(0));
    }
}
