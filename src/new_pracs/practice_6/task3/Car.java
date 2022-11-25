package new_pracs.practice_6.task3;

public class Car implements Nameable{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
