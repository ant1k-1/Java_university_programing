package new_pracs.practice_17.task2;

public class Employee {
    private String name;
    private Integer workHours;
    private Integer PaymentPerHour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Integer workHours) {
        this.workHours = workHours;
    }

    public Integer getPaymentPerHour() {
        return PaymentPerHour;
    }

    public void setPaymentPerHour(Integer paymentPerHour) {
        PaymentPerHour = paymentPerHour;
    }

    public Integer getSalary(){
        return workHours * PaymentPerHour;
    }
}
