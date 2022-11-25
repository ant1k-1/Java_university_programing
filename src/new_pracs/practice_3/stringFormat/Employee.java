package new_pracs.practice_3.stringFormat;

public class Employee {
    String fullname;
    Double salary;

    public Employee(String fullname, Double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public String getFullname() {
        return fullname;
    }
}
