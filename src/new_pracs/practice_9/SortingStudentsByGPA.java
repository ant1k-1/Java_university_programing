package new_pracs.practice_9;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (( ((Student) o1 ).getGPA() - ((Student) o2 ).getGPA() ) > 0)
            return 1;
        else if ((((Student) o1).getGPA() - ((Student) o2).getGPA()) < 0) {
            return -1;
        }
        else return 0;
    }
}
