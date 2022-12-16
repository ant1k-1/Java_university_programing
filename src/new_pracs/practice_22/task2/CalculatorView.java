package new_pracs.practice_22.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private JButton btnPlus, btnMinus, btnDivide, btnMultiply,
            btnDot, btnClear, btnResult;
    private JTextField textUserInput = new JTextField(16);
    private JButton[] numberedBtns = new JButton[10];
    public CalculatorView(){
        super("Postfix calculator");
        setSize(200,300);
        setMaximumSize(new Dimension(200,300));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        textUserInput.setEditable(false);
        textUserInput.setHorizontalAlignment(SwingConstants.RIGHT);
        textUserInput.setBackground(Color.white);

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
        setVisible(true);
    }
    public void setActionListener(ActionListener btnActionListener) {
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
    }

    public String getTextUserInput() {
        return textUserInput.getText();
    }

    public void setTextUserInput(String str) {
        this.textUserInput.setText(str);
    }

    public void alertMessage(String alert){
        JOptionPane.showMessageDialog(this, alert);
    }
    //    public static void main(String[] args) {
//        new CalculatorView().setVisible(true);
//    }

}
