import javax.swing.*;
import java.time.LocalDate;

public class Member {
    private int id;
    private String name;
    private LocalDate dob;
    private String job;

    public Member(int id, String name, LocalDate dob, String job) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", job='" + job + '\'' +
                '}';
    }
}
