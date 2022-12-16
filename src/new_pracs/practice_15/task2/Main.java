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
        final JLabel countryName = new JLabel("");
        final JLabel description = new JLabel("");

        String[] arCountries = {
                "Australia",
                "China",
                "England",
                "Russia",
        };

        panel[0] = new JPanel();
        panel[1] = new JPanel();
        panel[2] = new JPanel();

        add(panel[0]);
        add(panel[1]);
        add(panel[2]);

        countryName.setFont(fontMedium);
        panel[1].add(countryName);

        description.setFont(fontSmall);
        panel[2].add(description);


        JComboBox comboBox = new JComboBox(arCountries);
        comboBox.setFont(fontLarge);
        comboBox.setBackground(Color.WHITE);
        panel[0].add(comboBox);

        comboBox.addActionListener(e -> {
            JComboBox box = (JComboBox)e.getSource();
            String item = (String)box.getSelectedItem();
            countryName.setText(item);

            switch (item){
                case "Australia":
                    description.setText("Информация о Австралии");
                    break;
                case "Russia":
                    description.setText("Информация о России");
                    break;
                case "China":
                    description.setText("Информация о Китае");
                case "England":
                    description.setText("Информация о Англии");
            }
        });
        setSize(1080,720);
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
