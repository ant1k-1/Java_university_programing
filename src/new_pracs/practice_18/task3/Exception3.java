package new_pracs.practice_18.task3;

import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner( System.in);
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }catch (Exception e){
            System.out.println("Caught an Exception");
//        } catch (NumberFormatException e){
//            System.out.println("Input is not an integer");
        }
    }
    //происходят исключения:
    //NumberFormatException
    //Не скомпилится так как мы отловили общее исключение
    // (Exception предок NumberFormatException )
    public static void main(String[] args) {
        Exception3 exception3 = new Exception3();
        exception3.exceptionDemo();
    }
}