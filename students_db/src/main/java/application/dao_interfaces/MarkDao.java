package application.dao_interfaces;

import application.models.Mark;

import java.util.List;

public interface MarkDao {

    double getDisciplineAverageMark(int disciplineId);

    double getAverageMarkByStudent(int studentId);

    void updateMark(int markId, int newMark);

    List<Mark> getAllMarksByStudent(int studentId);

    List<Mark> getAllMarksByDiscipline(int disciplieId);

}
