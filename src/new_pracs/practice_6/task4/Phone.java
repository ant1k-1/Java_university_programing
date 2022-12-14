package new_pracs.practice_6.task4;

public class Phone implements Priceable {
    private double cost;
    private String model;

    public Phone(double cost, String model) {
        this.cost = cost;
        this.model = model;
    }

    @Override
    public double getPrice() {
        return cost;
    }
}
