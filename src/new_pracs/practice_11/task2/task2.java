package new_pracs.practice_11.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String userDate = scanner.nextLine();
        Date dateUser = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss").parse(userDate);

        Date systemDate = new Date();
        if (dateUser.compareTo(systemDate) == 0){
            System.out.println("User's date == system's date");
        } else if (dateUser.compareTo(systemDate) > 0) {
            System.out.println("User's date > system's date");
        } else {
            System.out.println("User's date < system's date");
        }
    }
}
