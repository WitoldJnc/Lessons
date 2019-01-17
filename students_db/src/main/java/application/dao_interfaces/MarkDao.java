package application.dao_interfaces;

import application.models.Marks;

import java.util.List;

public interface MarkDao {

    double getDisciplineAverageMark(int disciplineId);

    double getAverageMarkByStudent(int studentId);

    void updateMark(int markId, int newMark);


    List<Marks> getAllMarksByStudent(int studentId);

    List<Marks> getAllMarksByDiscipline(int disciplieId);

    List<Marks> getAllMakrs();

    void insertMark(Marks mark);

    void deleteMarkById(int id);


}
