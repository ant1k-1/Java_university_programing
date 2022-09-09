package Lab_3;

public abstract class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void showBreed();
    public abstract String toString();
}
