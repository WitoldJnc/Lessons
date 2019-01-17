package application.dao_impls;

import application.dao_interfaces.StudentDao;
import application.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Qualifier("studentDao")
public  class StudentDaoImpl implements StudentDao {

    private String sql;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertStudent(Student student) {
        sql = "insert into studentlist (student_id, student_name) values (?, ?);";
        jdbcTemplate.update(sql, student.getId(), student.getName());
    }


    @Override
    public void updateStudentName(int id, String newName) {
        sql ="update studentlist set student_name = ? where student_id = ?";
        jdbcTemplate.update(sql, newName, id);
    }

    @Override
    public int getStudentCount() {
        sql ="select count(*) from studentlist";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }


    @Override
    public void deleteStudentFromStudentListById(int id) {
        sql = "delete from studentlist where student_id =?;";
        jdbcTemplate.update(sql,id);
    }

    @Override
    public Student getStudentById(int id) {
        sql = "select * from studentlist where student_id = ?";
        return jdbcTemplate.queryForObject(sql,
                new Object[] {id}, new StudentRow());

    }


    @Override
    public List<Student> getStudentListByName(String name) {
        sql = "select * from studentlist where student_name like ( ? );";
        return jdbcTemplate.query(sql, new Object[] {name + "%"}, new StudentRow());
    }



    @Override
    public List<Student> getAllStudents() {
        sql = "select * from studentlist";
        return jdbcTemplate.query(sql, new StudentRow());
    }

    private static final class StudentRow implements RowMapper<Student> {

        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student newStudent = new Student();
            newStudent.setId(rs.getInt("student_id"));
            newStudent.setName(rs.getString("student_name"));
            return newStudent;
        }
    }


}
