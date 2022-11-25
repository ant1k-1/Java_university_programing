package new_pracs.practice_6.task4;

public class Book implements Priceable {
    private double cost;
    private String title;

    public Book(double cost, String title) {
        this.cost = cost;
        this.title = title;
    }

    @Override
    public double getPrice() {
        return cost;
    }
}
