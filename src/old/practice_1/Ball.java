package old.practice_1;
import java.lang.*;

public class Ball {
    private float cost;
    private String typeOfBall;

    public Ball(String typeOfBall, float cost){
        this.typeOfBall = typeOfBall;
        this.cost = cost;
    }

    public Ball(String typeOfBall){
        this.typeOfBall = typeOfBall;
    }

    public Ball(){
        typeOfBall = "Ball";
        cost = 0;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setTypeOfBall(String typeOfBall) {
        this.typeOfBall = typeOfBall;
    }

    public float getCost() {
        return cost;
    }

    public String getTypeOfBall() {
        return typeOfBall;
    }

    public String toString() {
        return "This ball is for " + this.getTypeOfBall() + " and its cost is " + this.getCost() + "$";
    }
}
