package new_pracs.practice_3.mathAndRandom.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Tester {
    Circle[] circles;
    int circlesCount;

    public Tester(int circlesCount){
        Random rnd = new Random();
        this.circlesCount = circlesCount;
        circles = new Circle[circlesCount];

        for (int i = 0; i < circlesCount; i++) {
            circles[i] = new Circle(
                    new Point(rnd.nextDouble(10.0), rnd.nextDouble(10.0)),
                    rnd.nextDouble(10.0)
            );
        }
    }

    public Circle findMin(){
        Circle minCircle = circles[0];
        for (int i = 1; i < circlesCount; i++) {
            if(minCircle.getRadius()>circles[i].getRadius()){
                minCircle = circles[i];
            }
        }
        return minCircle;
    }

    public Circle findMax(){
        Circle maxCircle = circles[0];
        for (int i = 1; i < circlesCount; i++) {
            if(maxCircle.getRadius() < circles[i].getRadius()){
                maxCircle = circles[i];
            }
        }
        return maxCircle;
    }

    public void sort(){
        Arrays.sort(circles, Comparator.comparingDouble(Circle::getRadius));
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < circlesCount; i++) {
            str+=circles[i].getRadius().toString() + " ";
        }
        return str;
    }
}
