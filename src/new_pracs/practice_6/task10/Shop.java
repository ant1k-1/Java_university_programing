package new_pracs.practice_6.task10;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> computers;

    public Shop(){
        computers = new ArrayList<>();
    }

    public void add(Computer computer){
        computers.add(computer);
    }

    public void delete(int index){
        computers.remove(index);
    }

    public void delete(Computer computer){
        computers.remove(computer);
    }
    
    public int find(Computer computer){
        return computers.indexOf(computer);
    }

    public Computer get(int index){
        return computers.get(index);
    }

    public void print(){
        System.out.println("=======================================");
        for (int i = 0; i < computers.size(); i++) {
            System.out.println(i + ". " + computers.get(i).getInfo());
        }
        System.out.println("=======================================");
    }
}
