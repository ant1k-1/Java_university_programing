package new_pracs.practice_6.task10;

import java.util.Scanner;

public class Monitor implements Infoable {
    private String name;
    private float diagonal;

    public Monitor() {
    }

    @Override
    public String getInfo() {
        return "diagonal: "+getDiagonal()+", model: "+getName();
    }

    @Override
    public void setInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter model and diagonal of monitor: ");
        name = scanner.nextLine();
        diagonal = scanner.nextFloat();
    }

    public Monitor(String name, float diagonal) {
        this.name = name;
        this.diagonal = diagonal;
    }

    public String getName() {
        return name;
    }

    public float getDiagonal() {
        return diagonal;
    }
}
