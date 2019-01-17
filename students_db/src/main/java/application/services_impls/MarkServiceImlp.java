package application.services_impls;

import application.dao_interfaces.MarkDao;
import application.models.Marks;
import application.services_intertaces.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("markService")
public class MarkServiceImlp implements MarkService {

    @Autowired
   private MarkDao markDao;


    @Override
    public double getDisciplineAverageMark(int disciplineId) {
        return markDao.getDisciplineAverageMark(disciplineId);
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
    public List<Marks> getAllMarksByStudent(int studentId) {
        return markDao.getAllMarksByStudent(studentId);
    }

    @Override
    public List<Marks> getAllMarksByDiscipline(int disciplieId) {
        return markDao.getAllMarksByDiscipline(disciplieId);
    }


    @Override
    public void insert(Marks mark) {
        markDao.insertMark(mark);

    }

    @Override
    public void deleteById(int id) {

        markDao.deleteMarkById(id);
    }

    @Override
    public List<Marks> getAll() {
        return markDao.getAllMakrs();
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Marks getbyId(int id) {
        return null;
    }


}
