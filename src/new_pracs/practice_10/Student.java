package new_pracs.practice_10;

//Создать свой класс Student со всеми переменными экземпляра,
//конструктором, включающим все переменные, предпочтительно использовать
//геттеры и сеттеры для каждой переменной. Класс студент имеет свойства: Имя,
//Фамилия, Специальность, Курс, Группа

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private String name;
    private String surname;
    private String speciality;
    private int course;
    private String group;

    private double GPA;

    private int comparatorType = 0;

    public int getComparatorType() {
        return comparatorType;
    }

    public void setComparatorType(int comparatorType) {
        this.comparatorType = comparatorType;
    }

    public Student(String name, String surname, String speciality, int course, String group, double GPA) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.GPA = GPA;
    }

    public Student(int comparatorType) {
        this.comparatorType = comparatorType;
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (this.getComparatorType() == 1) {
            if ((o1.getGPA() - o2.getGPA()) > 0)
                return 1;
            else if ((o1.getGPA() - o2.getGPA()) < 0) {
                return -1;
            } else return 0;
        } else if (this.getComparatorType() == 2) {
            return o1.getCourse() - o2.getCourse();
        }
        else return 0;
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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student { " + name + ", " + surname + ", " + speciality +
                ", course=" + course + ", "+ group +
                ", GPA=" + GPA +
                "}";
    }
}
