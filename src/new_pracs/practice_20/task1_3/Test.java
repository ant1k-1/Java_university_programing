package new_pracs.practice_20.task1_3;

public class Test {
    public static void main(String[] args) {
        GenericClass<Integer, String, Animal> test = new GenericClass<>(5, "temp", new Animal("testName"));
        test.printClassNames();
    }
}
