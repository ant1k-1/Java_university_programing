package new_pracs.practice_6.task11;

public class task11 implements Convertable{
    public task11() {}

    @Override

    public String convert(Float celsius) {
        Float K = celsius + 273.0f;
        Float F = 1.8f*celsius + 32.0f;
        return "K = " + K.toString() + ", F = " + F.toString();
    }

    public static void main(String[] args) {
        task11 celsius = new task11();
        System.out.println(celsius.convert(20.5f));
    }
}
