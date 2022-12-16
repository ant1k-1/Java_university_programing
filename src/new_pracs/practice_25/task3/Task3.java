package new_pracs.practice_25.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static boolean check(String str){
        return Pattern.matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$", str);
    }
    public static void main(String[] args) {
        String test1 = "127.0.0.0";
        String test2 = "255.255.255.0";
        String test3 = "1300.6.7.8";
        String test4 = "abc.def.gha.bcd";
        System.out.println(check(test1));
        System.out.println(check(test2));
        System.out.println(check(test3));
        System.out.println(check(test4));
    }
}
