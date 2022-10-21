package old.practice_1;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Star Wars");
        Book b3 = new Book("Dubrovsky", "A.S.Pushkin");
        b1.setAuthor("M.A. Bulgakov");
        b1.setTitle("Master and Margarita");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
