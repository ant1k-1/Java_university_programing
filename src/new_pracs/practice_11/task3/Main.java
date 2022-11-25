package new_pracs.practice_11.task3;
//Доработайте класс Student предусмотрите поле для хранения даты
//рождения, перепишите метод toString() таким образом, чтобы он разработайте
//метод, возвращал строковое представление даты рождения по вводимому в
//метод формату даты (например, короткий, средний и полный формат даты)

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Student student = new Student("Anton", "Mokin", "Programmer", 2, "IKBO-20-21", 4.7, "19.02.2003", 2);
        System.out.println(student);
    }
}
