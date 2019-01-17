package application.dao_interfaces;

import application.models.Disciplines;

import java.util.List;

public interface DisciplinesDao {

    void insertDiscipline(Disciplines disciplines);

    int getCount();

    void deleteDisciplineById(int id);

    void updateDisciplineName(int id, String newName);

    List<Disciplines> getDisciplineListByName(String name);

    Disciplines getDisciplinebyId(int id);

    List<Disciplines> getAllDisciplines();
}
