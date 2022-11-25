package new_pracs.practice_6.task6_9;

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
