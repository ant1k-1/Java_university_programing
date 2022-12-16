package new_pracs.practice_16.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fonts extends JFrame{
    public Fonts(){
        super("FontsApp");
        setSize(400,400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.BOLD, 20));
        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenuColors = new JMenu("Colors");
        JMenu jMenuFonts = new JMenu("Fonts");

        JMenuItem jMenuItemBlue = new JMenuItem("Blue");
        JMenuItem jMenuItemRed = new JMenuItem("Red");
        JMenuItem jMenuItemBlack = new JMenuItem("Black");

        JMenuItem jMenuItemTimes = new JMenuItem("Times New Roman");
        JMenuItem jMenuItemSans = new JMenuItem("MS Sans Serif");
        JMenuItem jMenuItemCourier = new JMenuItem("Courier New");

        jMenuColors.add(jMenuItemRed);
        jMenuColors.add(jMenuItemBlue);
        jMenuColors.add(jMenuItemBlack);

        jMenuFonts.add(jMenuItemTimes);
        jMenuFonts.add(jMenuItemSans);
        jMenuFonts.add(jMenuItemCourier);

        jMenuBar.add(jMenuColors);
        jMenuBar.add(jMenuFonts);

        this.setJMenuBar(jMenuBar);
        this.add(textArea,BorderLayout.CENTER);

        jMenuItemRed.addActionListener(e -> textArea.setForeground(Color.RED));

        jMenuItemBlue.addActionListener(e -> textArea.setForeground(Color.blue));

        jMenuItemBlack.addActionListener(e -> textArea.setForeground(Color.black));

        jMenuItemTimes.addActionListener(e -> textArea.setFont(new Font("Times New Roman",Font.BOLD, 20)));

        jMenuItemCourier.addActionListener(e -> textArea.setFont(new Font("MS Sans Serif", Font.BOLD, 20)));

        jMenuItemSans.addActionListener(e -> textArea.setFont(new Font("Courier New",Font.BOLD, 20)));
    }
    public static void main(String[] args) {
        new Fonts().setVisible(true);
    }
}
