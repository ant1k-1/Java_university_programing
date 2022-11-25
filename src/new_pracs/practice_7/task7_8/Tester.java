package new_pracs.practice_7.task7_8;

//7. Создать статический метод printMagazines(Printable[] printable) в
//классе Magazine, который выводит на консоль названия только журналов.
//8. Создать статический метод printBooks(Printable[] printable) в классе
//Book, который выводит на консоль названия только книг. Используем оператор
//instanceof
public class Tester {
    public static void main(String[] args) {
        Book book1 = new Book("Star Wars", "George Walton Lucas");
        Shop shop1 = new Shop("Stars", "Noname", 7);
        Shop shop2 = new Shop("Dacha", "Noname", 34);
        Printable[] printables = {book1, shop1, shop2};
        for (Printable printable:
             printables) {
            printable.print();
        }
        System.out.println("Only books:");
        Book.printBooks(printables);
        System.out.println("Only magazines:");
        Shop.printMagazines(printables);
    }
}
