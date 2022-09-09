package lab_2;
//Создать класс, описывающий тело человека(Human). Для описания
//каждой части тела создать отдельные классы(Head, Leg, Hand).
//Описать необходимые свойства и методы для каждого класса.
//Протестировать работу класса Human.

public class Human {
    private String gender;
    private int age;
    Head head;
    Leg legs;
    Hand hands;

    public Human() {};

    public Human(String gender, int age, String hairColor) {
        this.gender = gender;
        this.age = age;
        head = new Head();
        legs = new Leg();
        hands = new Hand();
        this.head.setHairColor(hairColor);
    }

    public void say(){
        System.out.println("Hello!");
    }

    @Override
    public String toString() {
        return "Human{" +
                "gender=" + gender +
                ", age=" + age +
                ", head=" + head +
                '}';
    }
}
