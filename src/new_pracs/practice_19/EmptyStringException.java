package new_pracs.practice_19;

public class EmptyStringException extends IllegalArgumentException {
    public EmptyStringException() {
        super("Empty string");
    }
}
