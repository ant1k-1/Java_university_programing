package new_pracs.practice_20.task4;

public class Calculator {
    public static <T extends Number, V extends Number> Double sum(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, V extends Number> Double sub(T a, V b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <T extends Number, V extends Number> Double div(T a, V b) throws ArithmeticException{
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number, V extends Number> Double mul(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(Calculator.sum(2, 3.14));
        System.out.println(Calculator.sub(2, 3.14));
        System.out.println(Calculator.div(2, 3.14));
        System.out.println(Calculator.mul(2, 3.14));
    }
}
