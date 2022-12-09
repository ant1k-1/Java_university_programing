package new_pracs.practice_15.task2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
    public Main(){
        super("Hello Swing");
        setLayout(new GridLayout(3,1));

        Font fontMedium = new Font("Verdana", Font.PLAIN, 24);
        Font fontLarge = new Font("Verdana", Font.PLAIN, 28);
        Font fontSmall = new Font("Verdana", Font.PLAIN, 20);

        JPanel[] panel = new JPanel[3];
        final JLabel countryName = new JLabel(" ");
        final JLabel textPopulation = new JLabel("");

        String[] arCountries = {
                "Australia",
                "China",
                "England",
                "Russia"
        };

        panel[0] = new JPanel();
        panel[0].setBackground(Color.WHITE);
        panel[1] = new JPanel();
        panel[1].setBackground(Color.WHITE);
        panel[2] = new JPanel();
        panel[2].setBackground(Color.WHITE);

        add(panel[0]);
        add(panel[1]);
        add(panel[2]);

        countryName.setFont(fontMedium);
        panel[1].add(countryName);

        textPopulation.setFont(fontSmall);
        panel[2].add(textPopulation);


        JComboBox comboBox = new JComboBox(arCountries);
        comboBox.setFont(fontLarge);
        comboBox.setBackground(Color.WHITE);
        panel[0].add(comboBox);

        comboBox.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox)e.getSource();
                String item = (String)box.getSelectedItem();
                countryName.setText(item);

                switch (item){
                    case "Australia":
                        textPopulation.setText("Информация о Австралии");
                        break;
                    case "Russia":
                        textPopulation.setText("Информация о России");
                        break;
                    case "China":
                        textPopulation.setText("Информация о Китае");
                }
            }
        });


        setSize(1080,720);
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
