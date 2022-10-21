package old.practice_1;

public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball();
        Ball b2 = new Ball("basketball");
        Ball b3 = new Ball("football", 100);
        b1.setCost(50);
        b1.setTypeOfBall("volleyball");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
