package application.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Student extends AbstractObject {

    private int id;
    private String studentName;
    private int groupId;

    public Student(String studentName, int groupId) {
        this.studentName = studentName;
        this.groupId = groupId;
    }
}
