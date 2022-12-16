package new_pracs.practice_21.task2_3;

public class Test {
    public static void main(String[] args) {

        Integer[] arrI = {1, 2, 3};
        Double[] arrD = {3.14, 2.27, 1.11};

        Container<Integer> integerContainer = new Container<>(arrI);
        Container<Double> doubleContainer = new Container<>(arrD);

        System.out.println(integerContainer.get(2));
        System.out.println(doubleContainer.get(2));
    }
}
