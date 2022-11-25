package new_pracs.practice_6.task3;

public class Tester {
    public static void main(String[] args) {
        Planet planet = new Planet("Earth");
        Car car = new Car("Lada");
        Animal animal = new Animal("Cat");
        System.out.println(planet.getName());
        System.out.println(car.getName());
        System.out.println(animal.getName());
    }
}
