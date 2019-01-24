//package application.services_impls;
//
//import application.dao_interfaces.GroupDisciplineDao;
//import application.models.Discipline;
//import application.models.GroupDiscipline;
//import application.services_intertaces.DisciplineService;
//import application.services_intertaces.GroupDisciplineService;
//import application.services_intertaces.SchoolGroupService;
//import application.services_intertaces.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service("groupDisciplineService")
//public class GroupDisciplineServiceImpl implements GroupDisciplineService {
//
//    @Autowired
//    private GroupDisciplineDao groupDisciplineDao;
//
//    @Autowired
//    private SchoolGroupService schoolGroupService;
//
//    @Autowired
//    private DisciplineService disciplineService;
//
//    @Override
//    public void insertGroupDiscipline(int groupNum, String disciplineName) {
//        groupDisciplineDao.insertGroupDiscipline(new GroupDiscipline(
//                schoolGroupService.getGroupId(groupNum),
//                disciplineService.getDisciplineIdByName(disciplineName)));
//    }
//
//    @Override
//    public void updateGroupByDiscipline(int groupId, int disciplineId) {
//        groupDisciplineDao.updateGroupByDiscipline(groupId, disciplineId);
//    }
//
//    @Override
//    public void updateDisciplineByGroup(int disciplineId, int groupId) {
//        groupDisciplineDao.updateDisciplineByGroup(disciplineId, groupId);
//    }
//
//    @Override
//    public void deleteByGroupId(int groupId) {
//        groupDisciplineDao.deleteByGroupId(groupId);
//    }
//
//    @Override
//    public void deleteByDisciplineId(int disciplineId) {
//        groupDisciplineDao.deleteByDisciplineId(disciplineId);
//    }
//
//    @Override
//    public int getDisciplineCountByGroup(int groupId) {
//        return groupDisciplineDao.getDisciplineCountByGroup(groupId);
//    }
//
//    @Override
//    public int getGroupCountByDiscipline(String disciplineName) {
//        return groupDisciplineDao.getGroupCountByDiscipline(
//                disciplineService.getDisciplineIdByName(disciplineName));
//    }
//
//    @Override
//    public List<GroupDiscipline> getAll() {
//        return groupDisciplineDao.getAll();
//    }
//
//    @Override
//    public List<GroupDiscipline> getByGroupId(int groupId) {
//        return groupDisciplineDao.getByGroupId(groupId);
//    }
//
//    @Override
//    public List<GroupDiscipline> getByDisciplineId(int disciplineId) {
//        return groupDisciplineDao.getByDisciplineId(disciplineId);
//    }
//}
