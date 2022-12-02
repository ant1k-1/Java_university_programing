package new_pracs.practice_12.task1;

import java.awt.*;

public abstract class Shape {
    Color color;
    Point pos;

    public Shape(int r, int g, int b, int x, int y) {
        this.color = new Color(r, g, b);
        this.pos = new Point(x, y);
    }
}
