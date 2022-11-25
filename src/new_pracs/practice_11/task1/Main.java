package new_pracs.practice_11.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Task1 obj = new Task1("Mokin", (new SimpleDateFormat("dd.MM.yyyy").parse("20.11.2022")));
        obj.setEnd(new Date());
        System.out.println(obj);
    }
}
