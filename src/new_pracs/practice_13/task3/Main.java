package new_pracs.practice_13.task3;

public class Main {
    public static void main(String[] args) {
        Address first = new Address("Russia, MOSCOW, Moscow, Lenina, 12, 2, 23", false);
        Address second = new Address("Russia, MOSCOW, Moscow, Lenina, 12, 2, 23", true);
        Address third = new Address("Russia; MOSCOW; Moscow; Lenina; 12; 2; 23", true);
        Address fourth = new Address("Russia. MOSCOW. Moscow. Lenina. 12. 2. 23", true);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }
}
