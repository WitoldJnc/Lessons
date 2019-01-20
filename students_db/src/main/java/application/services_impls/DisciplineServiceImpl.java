package application.services_impls;

import application.dao_interfaces.DisciplinesDao;
import application.models.Discipline;
import application.services_intertaces.DisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("disciplineService")
public class DisciplineServiceImpl implements DisciplineService {

    @Autowired
    private DisciplinesDao disciplinesDao;

    @Override
    public int insertDiscipline(String disciplineName) {
        return disciplinesDao.insertDiscipline(new Discipline(disciplineName));
    }

    @Override
    public int getCount() {
        return disciplinesDao.getCount();
    }

    @Override
    public void deleteDisciplineByName(String disciplineName) {
        disciplinesDao.deleteDisciplineById(disciplinesDao.getDisciplineIdByName(disciplineName));
    }

    @Override
    public void deleteDisciplineById(int id) {
        disciplinesDao.deleteDisciplineById(id);
    }

    @Override
    public void updateDisciplineName(int id, String newName) {
        disciplinesDao.updateDisciplineName(id, newName);
    }

    @Override
    public int getDisciplineIdByName(String name) {
        return disciplinesDao.getDisciplineIdByName(name);
    }

    @Override
    public Discipline getDisciplineByName(String name) {
        return disciplinesDao.getDisciplineByName(name);
    }

    @Override
    public List<Discipline> getDisciplinebyId(int id) {
        return disciplinesDao.getDisciplinebyId(id);
    }

    @Override
    public List<Discipline> getAllDisciplines() {
        return disciplinesDao.getAllDisciplines();
    }
}
