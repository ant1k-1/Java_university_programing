package new_pracs.practice_7.task4;

public class MathTester {
    public static void main(String[] args) {
        MathFunc math = new MathFunc();
        System.out.println("R = 3.5, P = " + math.CircleLength(3.5));
        System.out.println("z = 3 + 7i, |z| = " + math.complexAbs(3, 7));
        System.out.println("2.5^4 = " + math.pow(2.5, 4));
    }
}
