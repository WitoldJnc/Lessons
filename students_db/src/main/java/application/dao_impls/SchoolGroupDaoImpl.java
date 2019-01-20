package application.dao_impls;

import application.dao_interfaces.SchoolGroupDao;
import application.models.SchoolGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("studentGroupDao")
public class SchoolGroupDaoImpl implements SchoolGroupDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insertGroup(SchoolGroup schoolGroup) {
        String sql = "insert into school_groups (group_id, group_number) " +
                "values (?, ?);";
        jdbcTemplate.update(sql, schoolGroup.getGroupId(),
                schoolGroup.getGroupNumber());
        return schoolGroup.getGroupId();
    }

    @Override
    public void updateGroupNumber(int groupId, int newGroupNumber) {
        String sql = "update school_groups set group_number = ? where group_id = ?";
        jdbcTemplate.update(sql, newGroupNumber, groupId);
    }

    @Override
    public void deleteGroupById(int groupid) {
        String sql = "delete from school_groups where group_id =?;";
        jdbcTemplate.update(sql, groupid);
    }

    @Override
    public SchoolGroup getbyId(int id) {
        String sql = "select * from school_groups where group_id = ?";
        return jdbcTemplate.queryForObject(sql,
                new Object[]{id}, new BeanPropertyRowMapper<>(SchoolGroup.class));

    }

    @Override
    public int getGroupCount() {
        String sql = "select count(*) from school_groups";
        return jdbcTemplate.queryForObject(sql, Integer.class);
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
    public List<SchoolGroup> getAllGroup() {
        String sql = "select * from school_groups";
        return jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<>(SchoolGroup.class));
    }
}
