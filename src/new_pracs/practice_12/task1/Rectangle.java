package new_pracs.practice_12.task1;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape{
    int width, height;
    public Rectangle(int r, int g, int b, int x, int y, int width, int height){
        super(r, g, b, x, y);
        this.height = height;
        this.width = width;
    }
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        Rectangle2D.Double rectangle = new Rectangle2D.Double(pos.x, pos.y, width, height);
        g2d.setColor(color);
        g2d.fill(rectangle);
    }

}
