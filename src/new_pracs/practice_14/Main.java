package new_pracs.practice_14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //Необходимо реализовать консольное приложение,
    // позволяющее манипулировать строкой,
    // разбив ее на элементы путем использования регулярных выражений.
    public static void task1(String str){
        String[] strings = str.split("\\s+");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
    //Написать регулярное выражение, определяющее является ли
    // данная строка строкой "abcdefghijklmnopqrstuv18340" или нет.
    public static boolean task2(String str){
        return str.matches("abcdefghijklmnopqrstuv18340");
    }

    public static void task3(String str){
        Pattern pattern = Pattern.compile("^[0-9]{1,}.[0-9]{1,2}\\s(USD|RUB|EU)");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()){
            System.out.println(matcher.group());
        }

        //return str.matches("^[0-9]{1,}.[0-9]{1,2}\\s(USD|RUB|EU)");
    }

    public static boolean task4(String str){
        return str.matches(".*(\\+)\\s*[0-9]{1,}.*");
    }

    public static boolean task6(String str){
        return str.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)(()|(\\.([a-zA-Z])))$");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("task1: ");
        task1(str);
        System.out.println("task2: " + task2("abcdefghijklmnopqrstuv18340"));
        task3("wgdfhfghjfdj 25.98 USD text text text");
        System.out.println("task4: " +task4("6 / 5 – 2 * 9"));
        System.out.println("task6: " +task6("myhost@@@com.ru"));
    }

}
