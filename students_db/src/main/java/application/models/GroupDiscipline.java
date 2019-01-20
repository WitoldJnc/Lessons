package application.models;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class GroupDiscipline {

    private int groupId;
    private int disciplineId;

    public GroupDiscipline(int groupId, int disciplineId) {
        this.groupId = groupId;
        this.disciplineId = disciplineId;
    }
}
