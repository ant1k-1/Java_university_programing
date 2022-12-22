package new_pracs.practice_19;


public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String name) {
        super("Student "+ name + " not found");
    }
}
