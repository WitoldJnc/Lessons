package application.dao_impls;

import application.dao_interfaces.StudentDao;
import application.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentDaoImpl extends GenericDaoImpl<Student> implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public StudentDaoImpl() {
        table = "students";
    }

    @Override
    public void updateStudentName(int id, String newName) {
        String sql = "update students set student_name = ? where student_id = ?";
        jdbcTemplate.update(sql, newName, id);
    }

    @Override
    public int findByName(String studentName) {
        String sql = "select students.students.student_id from students where students.students.student_name like (?)";

        return jdbcTemplate.queryForObject(sql, new Object[]{studentName + "%"}, Integer.class);
    }

    @Override
    public void updateStudentGroup(int studentId, int groupId) {
        String sql = "update students set group_id = ? where student_id = ?";
        jdbcTemplate.update(sql, groupId, studentId);

    }

    @Override
    public List<Student> findListByName(String name) {
        String sql = "select * from students where student_name like ( ? );";
        return jdbcTemplate.query(sql, new Object[]{name + "%"},
                new BeanPropertyRowMapper<>(Student.class));
    }

    @Override
    protected Map<String, Object> insertParams(Student entity) {
        Map<String, Object> params = new HashMap<>();
        params.put("student_name", entity.getStudentName());
        params.put("group_id", entity.getGroupId());
        return params;
    }
}
