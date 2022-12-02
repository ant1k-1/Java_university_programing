package new_pracs.practice_12.task1;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.Random;

public class Triangle extends Shape{
    Point a, b, c;
    public Triangle(int r, int g, int b, int x, int y){
        super(r,g,b,x,y);
        Random random = new Random();
        this.a = new Point(x + random.nextInt(-100, 100), x + random.nextInt(-100, 100));
        this.b = new Point(x + random.nextInt(-100, 100), x + random.nextInt(-100, 100));
        this.c = new Point(x + random.nextInt(-100, 100), x + random.nextInt(-100, 100));
    }

    public void paint(Graphics g){
        int xPoints[] = {a.x, b.x, c.x};
        int yPoints[] = {a.y, b.y, c.y};
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath triangle = new GeneralPath();

        triangle.moveTo(xPoints[0] + pos.x, yPoints[0] + pos.y);

        for (int i = 1; i < xPoints.length; i++) {
            triangle.lineTo(xPoints[i] + pos.x, yPoints[i] + pos.y);
        }
        triangle.closePath();

        g2d.setColor(color);
        g2d.fill(triangle);

    }
}
