package Exp10;
import javax.swing.*;
import java.awt.Font;

public class _3Three {
    public static void main(String arg[]){
        JFrame frame = new JFrame("JRadioButton Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.setLayout(null);

        addComponents(frame);

        frame.setVisible(true);
    }
    private static void addComponents(JFrame frame){
        JLabel label = new JLabel("Please choose your favorite language.");
        label.setBounds(20,10,500,50);
        label.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(label);

        JRadioButton optJava = new JRadioButton("Java");
        optJava.setBounds(20,50,100,50);
        optJava.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(optJava);

        JRadioButton optAsp = new JRadioButton("ASP.Net");
        optAsp.setBounds(20,100,150,50);
        optAsp.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(optAsp);

        JRadioButton optSql = new JRadioButton("SQL");
        optSql.setBounds(20,150,100,50);
        optSql.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(optSql);

        optJava.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,"The Java option has been selected");
            optJava.setSelected(false);
        });
        optAsp.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "The ASP.Net has been selected");
            optAsp.setSelected(false);
        });
        optSql.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "The SQL has been selected");
            optSql.setSelected(false);
        });
    }
}
