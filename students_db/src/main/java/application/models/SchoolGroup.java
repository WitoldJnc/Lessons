package application.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class SchoolGroup extends AbstractObject {

    private int id;
    private int groupNumber;

    public SchoolGroup(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public SchoolGroup(int groupId, int groupNumber) {
        this.id = groupId;
        this.groupNumber = groupNumber;
    }
}
