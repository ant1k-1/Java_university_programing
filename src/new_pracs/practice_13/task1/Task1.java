package new_pracs.practice_13.task1;

public class Task1 {

    public static void ex1(String str){
        System.out.println(str);
    }

    public static char ex2(String str){
        return str.charAt(str.length()-1);
    }

    public static boolean ex3(String str){
        return str.endsWith("!!!");
    }

    public static boolean ex4(String str){
        return str.startsWith("I like");
    }

    public static boolean ex5(String str){
        return str.contains("Java");
    }

    public static int ex6(String str){
        return str.indexOf("Java");
    }

    public static String ex7(String str){
        return str.replace('a', 'o');
    }

    public static String ex8(String str){
        return str.toUpperCase();
    }

    public static String ex9(String str){
        return str.toLowerCase();
    }

    public static String ex10(String str){
        return str.substring(str.indexOf("Java"), str.indexOf("Java") + 4);
    }

    public static void main(String[] args) {
        ex1("I like Java!!!");
        System.out.println(ex2("Java"));
        System.out.println(ex3("Java!!!"));
        System.out.println(ex4("I like Java!!!"));
        System.out.println(ex5("I like Java!!!"));
        System.out.println(ex6("I like Java!!!"));
        System.out.println(ex7("aoaoaoaoa"));
        System.out.println(ex8("upper"));
        System.out.println(ex9("LOWER"));
        System.out.println(ex10("I like Java!!!"));
    }
}
