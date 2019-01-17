package application.services_impls;

import application.dao_interfaces.DisciplinesDao;
import application.models.Disciplines;
import application.services_intertaces.DisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("disciplineService")
public class DisciplineServiceImpl implements DisciplineService {

    @Autowired
   private DisciplinesDao disciplinesDao;


    @Override
    public void insert(Disciplines disciplines) {
        disciplinesDao.insertDiscipline(disciplines);

    }

    @Override
    public int getCount() {
        return disciplinesDao.getCount();
    }
    @Override
    public void deleteById(int id) {
        disciplinesDao.deleteDisciplineById(id);

    }

    @Override
    public void updateDisciplineName(int id, String newName) {
        disciplinesDao.updateDisciplineName(id, newName);

    }

    @Override
    public List<Disciplines> getDisciplineListByName(String name) {
        return disciplinesDao.getDisciplineListByName(name);
    }


    @Override
    public Disciplines getbyId(int id) {
        return disciplinesDao.getDisciplinebyId(id);
    }

    @Override
    public List<Disciplines> getAll() {
        return disciplinesDao.getAllDisciplines();
    }
}
