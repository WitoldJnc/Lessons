package application.dao_impls;

import application.dao_interfaces.StudentDao;
import application.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("studentDao")
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insertStudent(Student student) {
        String sql = "insert into students (student_id, student_name, group_id) values (?, ?, ?);";
        jdbcTemplate.update(sql, student.getStudentId(), student.getStudentName(), student.getGroupId());
        return student.getStudentId();
    }

    @Override
    public void updateStudentName(int id, String newName) {
        String sql = "update students set student_name = ? where student_id = ?";
        jdbcTemplate.update(sql, newName, id);
    }

    @Override
    public int getStudentCount() {
        String sql = "select count(*) from students";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public int getStudentId(String studentName) {
        String sql = "select students.students.student_id from students where students.students.student_name like (?)";

        return jdbcTemplate.queryForObject(sql, new Object[]{studentName + "%"}, Integer.class);
    }

    @Override
    public int getGroupCount(int goupId) {
        String sql = "select count(students.students.student_id) from students where group_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{goupId}, Integer.class);
    }

    @Override
    public void updateStudentGroup(int studentId, int groupId) {
        String sql = "update students set group_id = ? where student_id = ?";
        jdbcTemplate.update(sql, groupId, studentId);

    }

    @Override
    public void deleteStudentFromStudentListById(int id) {
        String sql = "delete from students where student_id =?;";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public Student getStudentById(int id) {
        String sql = "select * from students where student_id = ?";
        return jdbcTemplate.queryForObject(sql,
                new Object[]{id}, new BeanPropertyRowMapper<>(Student.class));

    }

    @Override
    public List<Student> getStudentListByName(String name) {
        String sql = "select * from students where student_name like ( ? );";
        return jdbcTemplate.query(sql, new Object[]{name + "%"},
                new BeanPropertyRowMapper<>(Student.class));
    }

    @Override
    public List<Student> getAllStudents() {
        String sql = "select * from students";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
    }
}
