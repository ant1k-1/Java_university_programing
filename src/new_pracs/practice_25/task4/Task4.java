package new_pracs.practice_25.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static boolean check(String str){
        Pattern pattern = Pattern.compile("\\([^()]*\\)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            str = matcher.replaceAll("");
            matcher = pattern.matcher(str);
        }
        return !(str.contains("(") || str.contains((")")));
    }

    public static void main(String[] args) {
        System.out.println("Test 1: " + check("(3*+*5)*–*9*×*4"));
        System.out.println("Test 2: " + check("((3*+*5)*–*9*×*4"));
    }
}
