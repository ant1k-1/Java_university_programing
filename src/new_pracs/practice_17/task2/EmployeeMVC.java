package new_pracs.practice_17.task2;

public class EmployeeMVC {
    public static Employee retreiveDataFromDatabase(){
        Employee employee = new Employee();
        employee.setWorkHours(9);
        employee.setPaymentPerHour(10);
        employee.setName("Ivan");
        return employee;
    }
    public static void main(String[] args) {
        Employee model = retreiveDataFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
    }
}
