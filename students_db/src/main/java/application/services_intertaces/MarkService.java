package application.services_intertaces;

import application.models.Mark;

import java.util.List;

public interface MarkService {

    double getDisciplineAverageMark(String disciplineName);

    double getAverageMarkByStudent(int studentId);

    void updateMark(int markId, int newMark);

    List<Mark> getAllMarksByStudent(int studentId);

    List<Mark> getAllMarksByDiscipline(String disciplineName);

    List<Mark> getAllMakrs();

    int insertMark(int mark, String disciplineName, int studentId);

    void deleteMarkById(int id);
}
