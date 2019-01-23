package application.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Mark extends AnyObject {

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
