package new_pracs.practice_15.task3;

import java.awt.*;
import javax.swing.*;

public class Menu extends JFrame {
    public Menu(){
        super("Menu");
        setSize(600,400);
        setLayout(new GridLayout(2,3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 18);

        JPanel[] panel = new JPanel[6];
        for (int i = 0; i < 6; i++) {
            panel[i] = new JPanel();
            add(panel[i]);
        }
        JButton btnFirst = new JButton("Button 1");
        JButton btnSecond = new JButton("Button 2");;

        JTextArea textArea = new JTextArea("Напишите текст тут");

        panel[0].add(btnFirst);
        btnFirst.setFont(font);

        panel[2].add(btnSecond);
        btnSecond.setFont(font);

        panel[4].add(textArea);
        textArea.setBackground(Color.WHITE);
        textArea.setFont(font);


        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.WHITE);

        JMenu menuFile = new JMenu("File");
        menuFile.setFont(font);

        JMenuItem itemSave = new JMenuItem("Save");
        itemSave.setFont(font);
        menuFile.add(itemSave);

        JMenuItem itemExit = new JMenuItem("Exit");
        itemExit.setFont(font);
        menuFile.add(itemExit);

        JMenu menuEdit = new JMenu("Edit");
        menuEdit.setFont(font);

        JMenuItem itemCopy = new JMenuItem("Copy");
        itemCopy.setFont(font);
        menuEdit.add(itemCopy);

        JMenuItem itemCut = new JMenuItem("Cut");
        itemCut.setFont(font);
        menuEdit.add(itemCut);

        JMenuItem itemPaste = new JMenuItem("Paste");
        itemPaste.setFont(font);
        menuEdit.add(itemPaste);

        JMenu menuHelp = new JMenu("Help");
        menuHelp.setFont(font);

        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuBar.add(menuHelp);

        setJMenuBar(menuBar);
    }

    public static void main(String[] args)
    {
        new Menu().setVisible(true);
    }
}
