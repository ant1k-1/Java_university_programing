package new_pracs.practice_7.task5_6;

public class Main {
    public static void main(String[] args) {
        String str = "Some string!";
        ProcessStrings processStrings = new ProcessStrings();
        System.out.println("Length: " + processStrings.getLength(str));
        System.out.println("Odd chars: " + processStrings.getOdd(str));
        System.out.println("Reverse: " + processStrings.getReverse(str));
    }
}
