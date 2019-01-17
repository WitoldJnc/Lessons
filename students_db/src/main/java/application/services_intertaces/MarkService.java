package application.services_intertaces;

import application.models.Marks;

import java.util.List;

public interface MarkService extends GenericService<Marks> {


    double getDisciplineAverageMark(int disciplineId);

    double getAverageMarkByStudent(int studentId);

    void updateMark(int markId, int newMark);

    List<Marks> getAllMarksByStudent(int studentId);

    List<Marks> getAllMarksByDiscipline(int disciplieId);

}
