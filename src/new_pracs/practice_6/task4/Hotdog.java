package new_pracs.practice_6.task4;

public class Hotdog implements Priceable {
    private double cost;

    public Hotdog(double cost) {
        this.cost = cost;
    }

    @Override
    public double getPrice() {
        return cost;
    }
}
