package practice_4;

import javax.swing.*;
import java.awt.*;

public class FootballMatch extends JFrame {
    private int real = 0, milan = 0;
    JButton jButton1 = new JButton("AC Milan");
    JButton jButton2 = new JButton("Real Madrid");
    JLabel jLabel1 = new JLabel("Result: " + milan + " X " +  real, SwingConstants.CENTER);
    JLabel jLabel2 = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
    JLabel jLabel3 = new JLabel("Winner: DRAW", SwingConstants.CENTER);

    public FootballMatch()
    {
        super("Football match!");
        setSize(600, 400);
        setLayout(new BorderLayout());
        jButton1.setBounds(100,200,125,100);
        jButton2.setBounds(350, 200, 125, 100);
        jLabel1.setBounds(190, 90, 200, 100);
        jLabel1.setFont(new Font("Times new roman",Font.BOLD,30));
        jLabel2.setBounds(190, 50, 225,100);
        jLabel2.setFont(new Font("Times new roman", Font.BOLD, 20));
        jLabel3.setSize(200, 100);
        jLabel3.setFont(new Font("Times new roman", Font.BOLD, 30));
        add(jButton1);
        add(jButton2);
        add(jLabel1, BorderLayout.CENTER);
        add(jLabel2, BorderLayout.CENTER);
        add(jLabel3, BorderLayout.CENTER);
        jButton1.addActionListener(e -> {
            milan++;
            updateLabels("AC Milan");
        });
        jButton2.addActionListener(e -> {
            real++;
            updateLabels("Real Madrid");
        });
    }

    public void updateLabels(String team){
        jLabel1.setText("Result: " + milan + " X " +  real);
        jLabel2.setText("Last Scorer: " + team);
        if (milan > real){
            jLabel3.setText("Winner: AC Milan");
        } else if (real > milan) {
            jLabel3.setText("Winner: Real Madrid");
        } else
            jLabel3.setText("Winner: DRAW");
    }

    public static void main(String[] args) {
        new FootballMatch().setVisible(true);
    }
}
