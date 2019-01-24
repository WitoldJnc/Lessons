package application.dao_impls;

import application.dao_interfaces.SchoolGroupDao;
import application.models.SchoolGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class SchoolGroupDaoImpl extends GenericDaoImpl<SchoolGroup> implements SchoolGroupDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public SchoolGroupDaoImpl() {
        table = "school_groups";
    }

    @Override
    public void updateGroupNumber(int groupId, int newGroupNumber) {
        String sql = "update school_groups set group_number = ? where group_id = ?";
        jdbcTemplate.update(sql, newGroupNumber, groupId);
    }

    @Override
    public int getStudentCountInGroup(int groupId) {
        String sql = "select count(students.students.student_id) from students where group_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{groupId}, Integer.class);
    }

    @Override
    public int getGroupId(int groupNum) {
        String sql = "select group_id from school_groups where group_number = ?;";
        return jdbcTemplate.queryForObject(sql, new Object[]{groupNum}, Integer.class);
    }

    @Override
    protected Map<String, Object> insertParams(SchoolGroup entity) {
        Map<String, Object> params = new HashMap<>();
        params.put("group_number", entity.getGroupNumber());
        return params;
    }
}
