package application.services_impls;

import application.dao_interfaces.DisciplinesDao;
import application.dao_interfaces.MarkDao;
import application.dao_interfaces.StudentDao;
import application.models.Mark;
import application.services_intertaces.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("markService")
public class MarkServiceImlp implements MarkService {

    @Autowired
    private MarkDao markDao;

    @Autowired
    private DisciplinesDao disciplinesDao;

    @Autowired
    private StudentDao studentDao;

    @Override
    public double getDisciplineAverageMark(String disciplineName) {
        return markDao.getDisciplineAverageMark(disciplinesDao.getDisciplineIdByName(disciplineName));
    }

    @Override
    public double getAverageMarkByStudent(int studentId) {
        return markDao.getAverageMarkByStudent(studentId);
    }

    @Override
    public void updateMark(int markId, int newMark) {
        markDao.updateMark(markId, newMark);
    }

    @Override
    public List<Mark> getAllMarksByStudent(int studentId) {
        return markDao.getAllMarksByStudent(studentId);
    }

    @Override
    public List<Mark> getAllMarksByDiscipline(String disciplineName) {
        return markDao.getAllMarksByDiscipline(disciplinesDao.getDisciplineIdByName(disciplineName));
    }

    @Override
    public List<Mark> getAllMakrs() {
        return markDao.getAllMakrs();
    }

    @Override
    public int insertMark(int mark, String disciplineId, int studentId) {
        return markDao.insertMark(new Mark(mark,
                disciplinesDao.getDisciplineIdByName(disciplineId),
                studentId));
    }

    @Override
    public void deleteMarkById(int id) {
        markDao.deleteMarkById(id);
    }
}
