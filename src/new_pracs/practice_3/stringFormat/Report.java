package new_pracs.practice_3.stringFormat;

import java.util.ArrayList;
import java.util.Formatter;

public class Report {
    public Report(ArrayList<Employee> employeeArrayList, int icount){
        for (int i = 0; i < icount; i++) {
            employeeArrayList.add(new Employee("Some name" + i, i*1000+0.555));
        }
    }
    
    static void generateReport(ArrayList<Employee> employeeArrayList){
        Formatter formatter = new Formatter();

        for (Employee employee: employeeArrayList) {
            formatter.format("%-10s %10.2f \n", employee.getFullname(), employee.getSalary());
        }
        System.out.println(formatter);
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Report report = new Report(employees, 10);
        report.generateReport(employees);
    }
}
