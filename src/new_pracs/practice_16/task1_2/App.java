package new_pracs.practice_16.task1_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App extends JFrame {

    JButton westButton = new JButton("WEST");
    JButton eastButton = new JButton("EAST");
    JButton northButton = new JButton("NORTH");
    JButton southButton = new JButton("SOUTH");
    JButton centerButton = new JButton("CENTER");


    public App(){
        JFrame frame = new JFrame("Mouse detector");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        Container container = getContentPane();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
            }
        });
        setLayout(new BorderLayout());
        //container.setLayout(new BorderLayout());

        container.add(westButton, BorderLayout.WEST );
        container.add(eastButton, BorderLayout.EAST);
        container.add(northButton, BorderLayout.NORTH);
        container.add(southButton, BorderLayout.SOUTH);
        container.add(centerButton, BorderLayout.CENTER);
        westButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(frame,
                        "Добро пожаловать на ЗАО",
                        "Запад",
                        JOptionPane.PLAIN_MESSAGE);
            }
        });
        eastButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(frame,
                        "Добро пожаловать на ВАО",
                        "Восток",
                        JOptionPane.PLAIN_MESSAGE);
            }
        });
        northButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(frame,
                        "Добро пожаловать на САО",
                        "Север",
                        JOptionPane.PLAIN_MESSAGE);
            }
        });
        southButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(frame,
                        "Добро пожаловать на ЮАО",
                        "Юг",
                        JOptionPane.PLAIN_MESSAGE);
            }
        });
        centerButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(frame,
                        "Добро пожаловать в ЦАО",
                        "Центр",
                        JOptionPane.PLAIN_MESSAGE);
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }
}
