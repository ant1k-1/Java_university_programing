package practice_6;

public class Student {
    private double GPA;
    private int idNumber;

    public Student(double GPA, int idNumber) {
        this.GPA = GPA;
        this.idNumber = idNumber;
    }

    public double getGPA() {
        return GPA;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "GPA=" + GPA +
                ", idNumber=" + idNumber +
                '}';
    }
}
