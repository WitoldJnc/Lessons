package application.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Discipline extends AnyObject {

    private int disciplineId;
    private String disciplineName;

    public Discipline(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    public Discipline(int disciplineId, String disciplineName) {
        this.disciplineId = disciplineId;
        this.disciplineName = disciplineName;
    }
}
