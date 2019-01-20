package application.dao_interfaces;

import application.models.Discipline;

import java.util.List;

public interface DisciplinesDao {

    int insertDiscipline(Discipline disciplines);

    int getCount();

    void deleteDisciplineById(int id);

    void updateDisciplineName(int id, String newName);

    Discipline getDisciplineByName(String name);

    int getDisciplineIdByName(String name);

    List<Discipline> getDisciplinebyId(int id);

    List<Discipline> getAllDisciplines();
}
