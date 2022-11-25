package new_pracs.practice_6.task10;

import java.util.Locale;
import java.util.Scanner;

public class Computer implements Infoable{
    private Processor processor;
    private Monitor monitor;
    private Memory memory;
    private Brands brand;
    private int price;

    public Computer(Processor processor, Monitor monitor, Memory memory, Brands brand, int price) {
        this.processor = processor;
        this.monitor = monitor;
        this.memory = memory;
        this.brand = brand;
        this.price = price;
    }

    public Computer(){
        this.setInfo();
    }

    public Processor getProcessor() {
        return processor;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Brands getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String getInfo() {
        return "CPU: " + processor.getInfo() + "\n" +
                "Monitor: " + monitor.getInfo() + "\n" +
                "Memory: " + memory.getInfo() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Brand: " + brand.toString();
    }

    @Override
    public void setInfo() {
        this.processor = new Processor();
        this.processor.setInfo();
        this.monitor = new Monitor();
        this.monitor.setInfo();
        this.memory = new Memory();
        this.memory.setInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the brand of PC: ");
        this.brand = Brands.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Enter the price of PC: ");
        this.price = scanner.nextInt();
    }
}
