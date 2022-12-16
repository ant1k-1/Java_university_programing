package new_pracs.practice_17.task2;

public class EmployeeController {
    Employee model;
    EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name){
        model.setName(name);
    }

    public String getEmployeeName(String name){
        return model.getName();
    }

    public void setEmployeeHourPayment(Integer payment){
        model.setPaymentPerHour(payment);
    }

    public void setEmployeeHours(Integer hours){
        model.setWorkHours(hours);
    }

    public String getEmployeeHourPayment(){
        return model.getPaymentPerHour().toString();
    }

    public String getEmployeeHours(){
        return model.getWorkHours().toString();
    }

    public void updateView(){
        view.printEmployeeDetails(model.getName(), model.getSalary().toString());
    }
}
