package Lab_3;

public class TestDog {
    public static void main(String[] args) {
        Dog dog1 = new GSD("Tim", 5);
        Dog dog2 = new Dalmatian("Hector", 2);
        Dog dog3 = new SiberianHusky("Laika", 8);

        System.out.println(dog1);
        dog1.showBreed();

        System.out.println(dog2);
        dog2.showBreed();

        System.out.println(dog3);
        dog3.showBreed();

    }
}
