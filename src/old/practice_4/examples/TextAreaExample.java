package old.practice_4.examples;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TextAreaExample extends JFrame
{
    JTextArea jta1 = new JTextArea(20,25);
    JButton button = new JButton("Add some Text");

    JScrollPane jScroll = new JScrollPane(jta1);

    public TextAreaExample()
    {
        super("Example");
        setSize(300,300);
        setLayout(new FlowLayout());
        add(jta1);
        add(button);
        add(jScroll);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String txt = JOptionPane.showInputDialog(null,"Insert some text");
                jta1.append(txt);
            }
        });
    }

    public static void main(String[]args)
    {
        new TextAreaExample().setVisible(true);
    }
}
