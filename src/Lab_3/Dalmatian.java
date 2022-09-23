package Lab_3;

public class Dalmatian extends Dog{

    public Dalmatian(String name, int age) {
        super(name, age);
    }

    @Override
    public void showBreed() {
        System.out.println("Breed - Dalmatian dog");
    }

    @Override
    public String toString() {
        return "Dalmatian{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
