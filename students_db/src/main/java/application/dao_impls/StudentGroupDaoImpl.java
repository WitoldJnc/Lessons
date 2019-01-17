package application.dao_impls;

import application.dao_interfaces.StudentGroupDao;
import application.models.StudentGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Qualifier("studentGroupDao")
public class StudentGroupDaoImpl implements StudentGroupDao {


    private String sql;

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void insertGroup(StudentGroup studentGroup) {
        sql = "insert into studentgroup (group_id, student_id, discipline_id) " +
                "values (?, ?, ?;";
        jdbcTemplate.update(sql, studentGroup.getGroup_id(),
                studentGroup.getStudent_id(), studentGroup.getDiscipline_id());
    }



    @Override
    public void updateStudentGroupID(int oldID, int newID) {
        sql = "update studentgroup set group_id = ? where group_id = ?";
        jdbcTemplate.update(sql, newID, oldID);
    }


    @Override
    public void deleteGroupById(int groupid) {
        sql = "delete from studentgroup where group_id =?;";
        jdbcTemplate.update(sql, groupid);
    }


    @Override
    public void deleteStudentFromGroupbyStudentId(int studentId) {
        sql = "delete from studentgroup where student_id =?;";
        jdbcTemplate.update(sql, studentId);
    }


    @Override
    public StudentGroup getbyId(int id) {
        throw new UnsupportedOperationException();

    }


    @Override
    public int getGroupCount() {
        sql = "select count(*) from studentgroup";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }


    @Override
    public int getStudentCountInGroup(int groupid) {
        sql = "select count(*) from studentgroup where group_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{groupid}, Integer.class);
    }


    @Override
    public List<StudentGroup> getGroupListByGroupId(int id) {
        sql = "select * from studentgroup where group_id = ?";
        return jdbcTemplate.query(sql,
                new Object[]{id}, new GroupRow());
    }


    @Override
    public List<StudentGroup> getAllGroup() {
        sql = "select * from studentgroup";

        return jdbcTemplate.query(sql, new GroupRow());
    }


    private static final class GroupRow implements RowMapper<StudentGroup> {

        @Override
        public StudentGroup mapRow(ResultSet rs, int rowNum) throws SQLException {
            StudentGroup newGroup = new StudentGroup();
            newGroup.setGroup_id(rs.getInt("group_id"));
            newGroup.setStudent_id(rs.getInt("student_id"));
            newGroup.setDiscipline_id(rs.getInt("discipline_id"));
            return newGroup;
        }
    }


}
