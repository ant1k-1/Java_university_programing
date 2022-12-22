package new_pracs.practice_19;

public class Student {
    private Double GPA;
    private String name;
    private  String surname;

    public Student(String name, String surname, double GPA) {
        this.GPA = GPA;
        this.name = name;
        this.surname = surname;
    }

    public Double getGPA() {
        return GPA;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "GPA=" + GPA +
                '}';
    }
}
