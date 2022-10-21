package lab_3;

public class SiberianHusky extends Dog{

    public SiberianHusky(String name, int age) {
        super(name, age);
    }

    @Override
    public void showBreed() {
        System.out.println("Breed - SiberianHusky dog");
    }

    @Override
    public String toString() {
        return "SiberianHusky{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
