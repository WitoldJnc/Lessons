package application.dao_interfaces;

import application.models.GroupDiscipline;

import java.util.List;

public interface GroupDisciplineDao {

    void insertGroupDiscipline(GroupDiscipline groupDiscipline);

    void updateGroupByDiscipline(int groupId, int disciplineId);

    void updateDisciplineByGroup(int disciplineId, int groupId);

    void deleteByGroupId(int groupId);

    void deleteByDisciplineId(int disciplineId);

    int getDisciplineCountByGroup(int groupId);

    int getGroupCountByDiscipline(int disciplineId);

    List<GroupDiscipline> getAll();

    List<GroupDiscipline> getByGroupId(int groupId);

    List<GroupDiscipline> getByDisciplineId(int disciplineId);
}
