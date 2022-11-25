package new_pracs.practice_6.task3;
//Создать интерфейс Nameable, с методом getName(), возвращающим
//имя объекта, реализующего интерфейс. Проверить работу для различных
//объектов (например, можно создать классы, описывающие разные сущности,
//которые могут иметь имя: планеты, машины, животные и т. д.)
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
