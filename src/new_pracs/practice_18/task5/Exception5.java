package new_pracs.practice_18.task5;

public class Exception5 {

    public static String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails" );
        }
        return "key is "+key;
    }

    public static void main(String[] args) {
        try {
            getDetails(null);
        } catch (NullPointerException e){
            System.out.println(e);
        }
    }

}