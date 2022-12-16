package new_pracs.practice_15.task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {



    Calculator(){
        super("Simple calculator");
        setSize(200,300);
        setMaximumSize(new Dimension(200,300));
        final String[] s0 = {""};
        final String[] s1 = {""};
        final String[] s2 = {""};
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JTextField textUserInput = new JTextField(16);
        textUserInput.setEditable(false);
        textUserInput.setHorizontalAlignment(SwingConstants.RIGHT);
        textUserInput.setBackground(Color.white);

        JButton btnPlus, btnMinus, btnDivide, btnMultiply,
                btnDot, btnClear, btnResult;
        JButton[] numberedBtns = new JButton[10];

        for (Integer i = 0; i < 10; i++) {
            numberedBtns[i] = new JButton(i.toString());
        }

        btnResult = new JButton("=");
        btnPlus = new JButton("+");
        btnMinus = new JButton("-");
        btnDivide = new JButton("/");
        btnMultiply = new JButton("*");
        btnClear = new JButton("C");
        btnDot = new JButton(".");

        JPanel jPanel = new JPanel();

        ActionListener btnActionListener = e -> {
            String s = e.getActionCommand();
            if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
                if (!s1[0].equals(""))
                    s2[0] += s;
                else {
                    s0[0] = s0[0] + s;
                }
                textUserInput.setText(s0[0] + s1[0] + s2[0]);
            }
            else if (s.charAt(0) == 'C') {
                s0[0] = s1[0] = s2[0] = "";
                textUserInput.setText(s0[0] + s1[0] + s2[0]);
            }
            else if (s.charAt(0) == '=') {
                double te;
                if (s1[0].equals("+"))
                    te = (Double.parseDouble(s0[0]) + Double.parseDouble(s2[0]));
                else if (s1[0].equals("-"))
                    te = (Double.parseDouble(s0[0]) - Double.parseDouble(s2[0]));
                else if (s1[0].equals("/"))
                    te = (Double.parseDouble(s0[0]) / Double.parseDouble(s2[0]));
                else
                    te = (Double.parseDouble(s0[0]) * Double.parseDouble(s2[0]));
                textUserInput.setText(s0[0] + s1[0] + s2[0] + "=" + te);
                s0[0] = Double.toString(te);
                s1[0] = s2[0] = "";
            }
            else {
                if (s1[0].equals("") || s2[0].equals(""))
                    s1[0] = s;
                else {
                    double te;
                    if (s1[0].equals("+"))
                        te = (Double.parseDouble(s0[0]) + Double.parseDouble(s2[0]));
                    else if (s1[0].equals("-"))
                        te = (Double.parseDouble(s0[0]) - Double.parseDouble(s2[0]));
                    else if (s1[0].equals("/"))
                        te = (Double.parseDouble(s0[0]) / Double.parseDouble(s2[0]));
                    else
                        te = (Double.parseDouble(s0[0]) * Double.parseDouble(s2[0]));
                    s0[0] = Double.toString(te);
                    s1[0] = s;
                    s2[0] = "";
                }
                textUserInput.setText(s0[0] + s1[0] + s2[0]);
            }
        };
        for (int i = 0; i < 10; i++) {
            numberedBtns[i].addActionListener(btnActionListener);
        }
        btnMultiply.addActionListener(btnActionListener);
        btnDivide.addActionListener(btnActionListener);
        btnMinus.addActionListener(btnActionListener);
        btnPlus.addActionListener(btnActionListener);
        btnDot.addActionListener(btnActionListener);
        btnClear.addActionListener(btnActionListener);
        btnResult.addActionListener(btnActionListener);

        jPanel.add(textUserInput);
        jPanel.add(numberedBtns[7]);
        jPanel.add(numberedBtns[8]);
        jPanel.add(numberedBtns[9]);
        jPanel.add(btnDivide);
        jPanel.add(numberedBtns[4]);
        jPanel.add(numberedBtns[5]);
        jPanel.add(numberedBtns[6]);
        jPanel.add(btnMultiply);
        jPanel.add(numberedBtns[1]);
        jPanel.add(numberedBtns[2]);
        jPanel.add(numberedBtns[3]);
        jPanel.add(btnMinus);
        jPanel.add(numberedBtns[0]);
        jPanel.add(btnDot);
        jPanel.add(btnResult);
        jPanel.add(btnPlus);
        jPanel.add(btnClear);
        add(jPanel);
    }

    public static void main(String[] args) {
        new Calculator().setVisible(true);
    }

}
