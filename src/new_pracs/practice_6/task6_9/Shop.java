package new_pracs.practice_6.task6_9;

public class Shop implements Printable{
    private String title;
    private String author;

    private int number;

    public Shop(String title, String author, int number) {
        this.title = title;
        this.author = author;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println(author + ": \"" + title + "\" #"+number);
    }
}
