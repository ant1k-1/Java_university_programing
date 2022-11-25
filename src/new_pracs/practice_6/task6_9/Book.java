package new_pracs.practice_6.task6_9;

public class Book implements Printable{
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println(author + ": \"" + title + "\"");
    }
}
