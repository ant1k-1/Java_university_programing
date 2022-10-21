package old.lab_3;

public abstract class Dog {
    protected String name;
    protected int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void showBreed();
    public abstract String toString();
}
