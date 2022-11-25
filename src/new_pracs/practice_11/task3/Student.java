package new_pracs.practice_11.task3;

//Доработайте класс Student предусмотрите поле для хранения даты
//рождения, перепишите метод toString() таким образом, чтобы он разработайте
//метод, возвращал строковое представление даты рождения по вводимому в
//метод формату даты (например, короткий, средний и полный формат даты).

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

public class Student implements Comparator<Student> {
    private String name;
    private String surname;
    private String speciality;
    private int course;
    private String group;

    private double GPA;

    private int comparatorType = 0;

    private Date birthday;

    private SimpleDateFormat birthdayFormatter;
    public int getComparatorType() {
        return comparatorType;
    }

    public void setComparatorType(int comparatorType) {
        this.comparatorType = comparatorType;
    }

    public Student(String name, String surname, String speciality, int course, String group, double GPA, String birthday, int dateFormat) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.GPA = GPA;
        this.birthday = new SimpleDateFormat("dd.MM.yyyy").parse(birthday);
        switch (dateFormat){
            case 1: birthdayFormatter = new SimpleDateFormat("E, d-M-y", Locale.ENGLISH); break;
            case 2: birthdayFormatter = new SimpleDateFormat("EEEE, d MMMM, yyyy", Locale.ENGLISH); break;
            case 3: birthdayFormatter = new SimpleDateFormat("E, dd.MM.yyyy 'at' hh:mm", Locale.ENGLISH); break;
        }
    }
    @Override
    public String toString() {
        return "Student { " + name + ", " + surname + ", " + speciality +
                ", course=" + course + ", "+ group +
                ", GPA=" + GPA +
                ", Birthday: " + birthdayFormatter.format(birthday)+ " }";
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

}
