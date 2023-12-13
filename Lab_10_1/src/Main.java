import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Main extends JPanel{
    public static void main(String[] args) {
        JFrame frame = new JFrame ("My first frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

        JLabel l = new JLabel ("Login ");
        JTextField tf=new JTextField(10);
        panel1.add(l);
        panel1.add(tf);


        JLabel l2=new JLabel("Password");
        JTextField textfild1 = new JTextField(10);
        panel2.add(l2);
        panel2.add(textfild1);
        panel2.setLayout(new FlowLayout());

        JCheckBox c1=new JCheckBox("Agree with License");
        panel3.add(c1);


        JButton b1 = new JButton("Log in");
        panel4.add(b1);
        LoginButtonListener a=new LoginButtonListener();
        b1.addActionListener(a);

        JPanel p = new JPanel();
        p.add(panel1);
        p.add(panel2);
        p.add(panel3);
        p.add(panel4);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        frame.setContentPane(p);
        frame.setVisible(true);

    }
}