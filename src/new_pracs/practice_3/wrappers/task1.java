package new_pracs.practice_3.wrappers;

public class task1 {
    public static void main(String[] args) {
        Double d1, d2, d3;
        d1 = Double.valueOf(2.5);
        d2 = Double.valueOf(4.125347);
        d3 = Double.parseDouble("2.54367");
        System.out.println("ParseDouble: "+d3);
        int n = d1.intValue();
        float f = d1.floatValue();
        long l = d1.longValue();
        byte b = d1.byteValue();
        double d = d1.doubleValue();
        short s = d1.shortValue();
        System.out.println("Double to int: " + n);
        System.out.println("Double to float: " + f);
        System.out.println("Double to long: " + l);
        System.out.println("Double to byte: " + b);
        System.out.println("Double to double: " + d);
        System.out.println("Double to short: " + s);
        System.out.println("Double 1: " + d1);
        System.out.println("Double 2: " + d2);
        String ds = Double.toString(3.14);
        System.out.println("double to String: " + ds);
    }
}
