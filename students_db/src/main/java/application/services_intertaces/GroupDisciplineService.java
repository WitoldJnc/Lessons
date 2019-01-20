package application.services_intertaces;

import application.models.GroupDiscipline;

import java.util.List;

public interface GroupDisciplineService {

    void insertGroupDiscipline(int groupNum, String disciplineName);

    void updateGroupByDiscipline(int groupId, int disciplineId);

    void updateDisciplineByGroup(int disciplineId, int groupId);

    void deleteByGroupId(int groupId);

    void deleteByDisciplineId(int disciplineId);

    int getDisciplineCountByGroup(int groupId);

    int getGroupCountByDiscipline(String disciplineName);

    List<GroupDiscipline> getAll();

    List<GroupDiscipline> getByGroupId(int groupId);

    List<GroupDiscipline> getByDisciplineId(int disciplineId);
}
