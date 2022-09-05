package practice_3;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft, bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft.x = x1;
        topLeft.y = y1;
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;
        bottomRight.x = x2;
        bottomRight.y = y2;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }

    public String toString(){
        return "The rectangle is now at topLeft (" + topLeft.x + ", " + topLeft.y +
                "), bottomRight (" + bottomRight.x + ", " + bottomRight.y + ")";
    }

    public boolean isValidMovement(){
        if (topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed){
            return true;
        } else return false;
    }
    @Override
    public void moveUp() {
        if (isValidMovement()) {
            topLeft.y += topLeft.ySpeed;
            bottomRight.y += bottomRight.ySpeed;
        } else System.out.println("topLeft's speed is not equal bottomRight's speed. Cannot move!");
    }

    @Override
    public void moveDown() {
        if (isValidMovement()) {
            topLeft.y -= topLeft.ySpeed;
            bottomRight.y -= bottomRight.ySpeed;
        } else System.out.println("topLeft's speed is not equal bottomRight's speed. Cannot move!");
    }

    @Override
    public void moveLeft() {
        if (isValidMovement()) {
            topLeft.x -= topLeft.xSpeed;
            bottomRight.x -= bottomRight.xSpeed;
        } else System.out.println("topLeft's speed in not equal bottomRight's speed. Cannot move!");
    }

    @Override
    public void moveRight() {
        if (isValidMovement()) {
            topLeft.x += topLeft.xSpeed;
            bottomRight.x += bottomRight.xSpeed;
        } else System.out.println("topLeft's speed in not equal bottomRight's speed. Cannot move!");
    }
}
