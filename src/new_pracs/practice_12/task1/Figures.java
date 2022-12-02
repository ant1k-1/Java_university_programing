package new_pracs.practice_12.task1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Figures extends JPanel {
    public Figures(){
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(1080, 720));
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Random random = new Random();
        ArrayList shapes = new ArrayList<>();
        String[] shapesName = new String[]{"Circle", "Rectangle", "Triangle"};
        for (int count = 0; count < 20; count++) {
            String shape = shapesName[random.nextInt(3)];
            switch (shape) {
                case "Circle": {
                    Circle circle = new Circle(random.nextInt(256), random.nextInt(256), random.nextInt(256), random.nextInt(500), random.nextInt(500), random.nextInt(100));
                    circle.paint(g);
                    break;
                }
                case "Rectangle": {
                    Rectangle rec = new Rectangle(random.nextInt(256), random.nextInt(256), random.nextInt(256), random.nextInt(500), random.nextInt(500), random.nextInt(200), random.nextInt(200));
                    rec.paint(g);
                    break;
                }
                case "Triangle": {
                    Triangle triangle = new Triangle(random.nextInt(256), random.nextInt(256), random.nextInt(256), random.nextInt(500), random.nextInt(500));
                    triangle.paint(g);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Figures");
        frame.add(new Figures());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
