package new_pracs.practice_13.task2;

//Разработать класс Person, в котором имеется функция,
//возвращающая Фамилию И.О. Функция должна учитывать возможность
//отсутствия значений в полях Имя и Отчество.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ivanov", "Ivan", "Ivanovich");
        person.print();

        Person person2 = new Person("Ivanov", "Ivan");
        person2.print();
    }
}
