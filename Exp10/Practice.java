package Exp10;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Practice {
    public static void main(String arg[]){
        JFrame frame = new JFrame("Hello");
        addComponents(frame);
        frame.setVisible(true);
    }

    private static void addComponents(JFrame frame){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.setLayout(null);

        JLabel label = new JLabel("Hello World");
        label.setBounds(100,100,100,50);
        label.setFont(new Font("Arial",Font.BOLD,18));
        frame.add(label);

        JTextField text = new JTextField(20);
        text.setBounds(250,110,100,25);
        frame.add(text);

        JButton button = new JButton("OK");
        button.setBounds(200,150,100,50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String word = text.getText();
                JOptionPane.showMessageDialog(null,word);
            }
        });
        frame.add(button);
    }
}
