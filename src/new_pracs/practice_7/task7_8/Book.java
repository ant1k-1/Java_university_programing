package new_pracs.practice_7.task7_8;

public class Book implements Printable {
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

    static void printBooks(Printable[] printables){
        for (Printable printable : printables)
            if (printable instanceof Book)
                printable.print();
    }
}
