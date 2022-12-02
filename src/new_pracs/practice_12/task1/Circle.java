package new_pracs.practice_12.task1;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape{
    int diameter;
    public Circle(int r, int g, int b, int x, int y, int diameter){
        super(r, g, b, x, y);
        this.diameter = diameter;
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(pos.x, pos.y, diameter, diameter);
        g2d.setColor(color);
        g2d.fill(circle);
    }

}
