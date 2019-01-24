package application.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class GroupDiscipline extends AbstractObject {

    private int groupId;
    private int disciplineId;

    public GroupDiscipline(int groupId, int disciplineId) {
        this.groupId = groupId;
        this.disciplineId = disciplineId;
    }
}
