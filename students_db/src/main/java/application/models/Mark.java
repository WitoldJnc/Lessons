package application.models;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Mark {

    private int markId;
    private int mark;
    private int disciplineId;
    private int studentId;

    public Mark(int mark, int disciplineId, int studentId) {
        this.mark = mark;
        this.disciplineId = disciplineId;
        this.studentId = studentId;
    }
}
