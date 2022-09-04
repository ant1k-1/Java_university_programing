package practice_3;

public class Reactangle extends Shape{
    protected double width;
    protected double length;

    public Reactangle(){}
    public Reactangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Reactangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return getWidth()*getLength();
    }

    @Override
    public double getPerimeter() {
        return 2*(getWidth()*getLength());
    }

    @Override
    public String toString() {
        return "This is a rectangle, width = " + this.width + ", length = " + this.length+ '.';
    }
}
