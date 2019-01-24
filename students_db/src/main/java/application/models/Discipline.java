package application.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Discipline extends AbstractObject {

    private int id;
    private String disciplineName;

    public Discipline(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    public Discipline(int disciplineId, String disciplineName) {
        this.id = disciplineId;
        this.disciplineName = disciplineName;
    }
}
