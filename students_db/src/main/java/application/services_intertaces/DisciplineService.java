package application.services_intertaces;

import application.models.Disciplines;

import java.util.List;

public interface DisciplineService extends GenericService<Disciplines> {


    List<Disciplines> getDisciplineListByName(String name);

    void updateDisciplineName(int id, String newName);
}
