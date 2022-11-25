package new_pracs.practice_7.task5_6;

public class ProcessStrings implements Stringable{
    public ProcessStrings() {}
    @Override
    public int getLength(String source) {
        return source.length();
    }

    @Override
    public String getOdd(String source) {
        String str = "";
        for (int i = 0; i < source.length(); i++) {
            if (i%2 == 1) str+=source.charAt(i);
        }
        return str;
    }

    @Override
    public String getReverse(String source) {
        String str = "";
        for (int i = source.length() - 1; i >= 0; i--) {
            str+=source.charAt(i);
        }
        return str;
    }
}
