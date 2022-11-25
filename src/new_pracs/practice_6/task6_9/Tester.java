package new_pracs.practice_6.task6_9;

//6. Определить интерфейс Printable, содержащий метод void print().
//7. Определить класс Book, реализующий интерфейс Printable.
//8. Определить класс Shop, реализующий интерфейс Printable.
//9. Создать массив типа Printable, который будет содержать книги и
//журналы. В цикле пройти по массиву объектов и вызвать метод print() для
//каждого объекта

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Printable> printableArrayList = new ArrayList<>();
        printableArrayList.add(new Book("Star Wars", "George Walton Lucas"));
        printableArrayList.add(new Shop("Stars", "Noname", 7));
        printableArrayList.add(new Shop("Dacha", "Noname", 34));
        for (Printable printable:
             printableArrayList) {
            printable.print();
        }
    }
}
