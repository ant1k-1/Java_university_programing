package old.practice_4.examples;

import javax.swing.*;
import java.awt.*;

public class example_1  extends JFrame{
    JTextField jta = new JTextField(10);
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    example_1()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,100);
        add(jta);
        jta.setForeground(Color.PINK);
        jta.setFont(fnt);
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new example_1();
    }
}
