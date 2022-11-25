package new_pracs.practice_6.task10;

import java.util.Scanner;

public class Processor implements Infoable{
    private int cores;
    private String name;

    public Processor() {
    }

    public Processor(int cores, String name) {
        this.cores = cores;
        this.name = name;
    }

    @Override
    public String getInfo() {
        return "cores: "+getCores()+", model: "+getName();
    }

    @Override
    public void setInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter model and cores of CPU: ");
        name = scanner.nextLine();
        cores = scanner.nextInt();
    }

    public int getCores() {
        return cores;
    }

    public String getName() {
        return name;
    }
}
