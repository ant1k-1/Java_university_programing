package new_pracs.practice_6.task10;

public class Tester {
    public static void main(String[] args) {
        Computer comp1 = new Computer(
                new Processor(8, "AMD"),
                new Monitor("AOC", 27.0f),
                new Memory("some name", 32),
                Brands.HP, 100000);
        Computer comp2 = new Computer(
                new Processor(8, "AMD"),
                new Monitor("AOC", 27.0f),
                new Memory("some name", 32),
                Brands.HP, 100000);
        Computer comp3 = new Computer();
        Shop shop = new Shop();
        shop.add(comp1);
        shop.add(comp2);
        shop.add(comp3);
        shop.print();
        shop.delete(1);
        shop.print();
        System.out.println("FIND: \n"+shop.get(shop.find(comp3)).getInfo());
    }
}
