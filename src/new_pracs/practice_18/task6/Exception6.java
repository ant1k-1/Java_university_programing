package new_pracs.practice_18.task6;

public class Exception6 {
    public static void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }
        catch (Exception e){
            System.out.println("Message is invalid");
        }
    }
    public static String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( " null key in getDetails"  );
        }
        return "data for" + key;
    }

    public static void main(String[] args) {
        printMessage(null);
    }

}