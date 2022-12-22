package new_pracs.practice_19;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Ivan", "Ivanov", 5.0));
        s.add(new Student("Petr", "Petrov", 4.0));
        s.add(new Student("Alex", "Petrov", 4.5));
        new LabClassUI(s);
    }
}