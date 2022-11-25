package new_pracs.practice_11.task1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 {
    private String developer;
    private Date start;
    private Date end;

    public Task1(String developer, Date start) {
        this.developer = developer;
        this.start = start;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Developer: " + developer +
                "\nStart: \t" + new SimpleDateFormat("dd - MM - yyyy").format(start) +
                "\nEnd: \t" + new SimpleDateFormat("dd - MM - yyyy").format(end) +
                "\ntime: \t" + (end.getTime() - start.getTime())/(1000 * 3600)
                + " h";
    }
}
