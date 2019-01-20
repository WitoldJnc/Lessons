package application.models;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class SchoolGroup {

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
