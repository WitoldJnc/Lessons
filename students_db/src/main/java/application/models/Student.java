package application.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Student {

    private int studentId;
    private String studentName;
    private int groupId;

    public Student(String studentName, int groupId) {
        this.studentName = studentName;
        this.groupId = groupId;
    }
}
