package new_pracs.practice_13.task2;

public class Person {
    String surname = "";
    String name = " ";
    String patronymic = " ";

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public void print(){
        System.out.println(surname + " " + name.charAt(0) + " " + patronymic.charAt(0));
    }
}
