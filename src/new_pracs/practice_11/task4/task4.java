package new_pracs.practice_11.task4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date userDate = new Date();
        Calendar userCalendar = Calendar.getInstance();
        int year, month, day, hours, minutes;

        year = scanner.nextInt();
        month = scanner.nextInt();
        day = scanner.nextInt();
        hours = scanner.nextInt();
        minutes = scanner.nextInt();

        userDate.setYear(year - 1900);
        userDate.setMonth(month - 1);
        userDate.setDate(day);
        userDate.setHours(hours);
        userDate.setMinutes(minutes);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy 'at' hh:mm");
        System.out.println("Date: " + dateFormat.format(userDate));

        userCalendar.set(Calendar.YEAR, year);
        userCalendar.set(Calendar.MONTH,month -1);
        userCalendar.set(Calendar.DAY_OF_MONTH, day);
        userCalendar.set(Calendar.HOUR,hours);
        userCalendar.set(Calendar.MINUTE,minutes);

        SimpleDateFormat calFormat = new SimpleDateFormat("dd.MM.yyyy 'at' hh:mm");
        System.out.println("Calendar: " + dateFormat.format(userCalendar.getTime()));
    }
}
