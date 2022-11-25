package new_pracs.practice_6.task4;
//Реализовать интерфейс Priceable, имеющий метод getPrice(),
//возвращающий некоторую цену для объекта. Проверить работу для различных
//классов, сущности которых могут иметь цену
public class TestPrices {
    public static void main(String[] args) {
        Priceable book = new Book(10, "Star Wars");
        Priceable hotdog = new Hotdog(3);
        Priceable phone = new Phone(500, "Samsung");
        System.out.println("Book's cost is " + book.getPrice());
        System.out.println("hotdog's cost is " + hotdog.getPrice());
        System.out.println("phone's cost is " + phone.getPrice());
    }
}
