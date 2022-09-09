package lab_2;

public class TestHuman {
    public static void main(String[] args) {
        Human human = new Human("male", 30, "blonde");
        human.head.thinking();
        human.legs.walk();
        human.say();
        human.hands.handshake();
        System.out.println(human.toString());

    }
}
