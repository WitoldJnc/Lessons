package application.models;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Discipline {

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
