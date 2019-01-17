package application.dao_impls;

import application.dao_interfaces.MarkDao;
import application.models.Marks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Qualifier("markDao")
public class MarkDaoImpl implements MarkDao {
    private String sql;

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void insertMark(Marks mark) {
        sql = "insert into studentmarks (id, student_id, discipline_id, mark) values" +
                " (?, ?, ?, ?);";
        jdbcTemplate.update(sql, mark.getId(), mark.getStudent_id(),
                mark.getDiscipline_id(), mark.getMark());
    }

    @Override
    public void updateMark(int markId, int newMark) {
        sql = "update studentmarks set mark = :? where id = ?;";
        jdbcTemplate.update(sql, newMark, markId);
    }


    @Override
    public void deleteMarkById(int id) {
        sql = "delete from studentmarks where id = ?;";
        jdbcTemplate.update(sql, id);
    }


    @Override
    public double getDisciplineAverageMark(int disciplineId) {
        sql = "select avg(mark) from studentmarks where discipline_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{disciplineId}, double.class);
    }


    @Override
    public double getAverageMarkByStudent(int studentId) {
        sql = "select avg(mark) from studentmarks where student_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{studentId}, double.class);
    }


    @Override
    public List<Marks> getAllMarksByStudent(int studentId) {
        sql = "select * from studentmarks where student_id = ?";
        return jdbcTemplate.query(sql, new Object[]{studentId}, new MarkRow());
    }


    @Override
    public List<Marks> getAllMarksByDiscipline(int disciplieId) {
        sql = "select * from studentmarks where discipline_id = ?";
        return jdbcTemplate.query(sql, new Object[]{disciplieId}, new MarkRow());
    }


    @Override
    public List<Marks> getAllMakrs() {
        String sql = "Select * from studentmarks";
        return jdbcTemplate.query(sql, new MarkRow());
    }


    private static final class MarkRow implements RowMapper<Marks> {

        @Override
        public Marks mapRow(ResultSet rs, int rowNum) throws SQLException {
            Marks marks = new Marks();
            marks.setId(rs.getInt("id"));
            marks.setStudent_id(rs.getInt("student_id"));
            marks.setDiscipline_id(rs.getInt("discipline_id"));
            marks.setMark(rs.getInt("mark"));
            return marks;
        }
    }

}
