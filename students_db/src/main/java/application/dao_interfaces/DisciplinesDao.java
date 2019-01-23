package application.dao_interfaces;

import application.models.Discipline;

public interface DisciplinesDao {

    void updateDisciplineName(int id, String newName);

    Discipline getDisciplineByName(String name);

    int getDisciplineIdByName(String name);

}

