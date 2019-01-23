package application.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class SchoolGroup extends AnyObject {

    private int groupId;
    private int groupNumber;

    public SchoolGroup(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public SchoolGroup(int groupId, int groupNumber) {
        this.groupId = groupId;
        this.groupNumber = groupNumber;
    }
}
