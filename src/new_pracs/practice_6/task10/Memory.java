package new_pracs.practice_6.task10;

import java.util.Scanner;

public class Memory implements Infoable{
    private String name;
    private int capacity;

    public Memory() {
    }

    @Override
    public String getInfo() {
        return "capacity: "+getCapacity()+", model: "+getName();
    }

    @Override
    public void setInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter model and capacity of RAM: ");
        name = scanner.nextLine();
        capacity = scanner.nextInt();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public Memory(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}
