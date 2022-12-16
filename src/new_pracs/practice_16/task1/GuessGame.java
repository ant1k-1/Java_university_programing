package new_pracs.practice_16.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GuessGame extends JFrame {
    public GuessGame(){
        super("GuessGame");
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JTextField input = new JTextField(10);
        input.setSize(100,100);
        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));

        contents.add(input);
        setContentPane(contents);
        JButton jBtn = new JButton("Попробовать");
        contents.add(jBtn);
        final int[] counter = {0};
        Random random = new Random();
        Integer guessNumber = random.nextInt(0, 50);

        jBtn.addActionListener(e -> {
            if(input.getText() == "") return;
            if (input.getText().equals(guessNumber.toString())){
                JOptionPane.showMessageDialog(getContentPane(),"Угадал!");
                setVisible(false);
                dispose();
            }
            else if(counter[0] == 2){
                JOptionPane.showMessageDialog(getContentPane(),"Не угадал( Кончились попытки!");
                setVisible(false);
                dispose();
            }
            else{
                counter[0]++;
                if (Integer.parseInt(input.getText()) > guessNumber){
                    JOptionPane.showMessageDialog(getContentPane(),"Число меньше!");
                }
                else{
                    JOptionPane.showMessageDialog(getContentPane(),"Число больше!");
                }
            }
        });
    }

    public static void main(String[] args) {
        new GuessGame().setVisible(true);
    }
}
