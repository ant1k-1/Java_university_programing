package new_pracs.practice_18.task4;

import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner( System.in);
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } catch (NumberFormatException e){
            System.out.println("Input is not an integer");
        } catch (Exception e){
            System.out.println("Caught an Exception");
        } finally {
            System.out.println("Successful!");
        }
    }
    //выведет УСПЕХ если не поймает исключение
    public static void main(String[] args) {
        Exception4 exception4 = new Exception4();
        exception4.exceptionDemo();
    }
}
