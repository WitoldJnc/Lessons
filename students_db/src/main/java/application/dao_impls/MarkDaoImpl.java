package application.dao_impls;

import application.dao_interfaces.MarkDao;
import application.models.Mark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("markDao")
public class MarkDaoImpl implements MarkDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insertMark(Mark mark) {
        String sql = "insert into marks (mark, discipline_id, student_id)  values" +
                " ( ?, ?, ?);";
        jdbcTemplate.update(sql, mark.getMark(),
                mark.getDisciplineId(), mark.getStudentId());
        return mark.getMarkId();
    }

    @Override
    public void updateMark(int markId, int newMark) {
        String sql = "update marks set mark = :? where mark_id = ?;";
        jdbcTemplate.update(sql, newMark, markId);
    }

    @Override
    public void deleteMarkById(int id) {
        String sql = "delete from marks where mark_id = ?;";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public double getDisciplineAverageMark(int disciplineId) {
        String sql = "select avg(mark) from marks where discipline_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{disciplineId}, double.class);
    }

    @Override
    public double getAverageMarkByStudent(int studentId) {
        String sql = "select avg(mark) from marks where student_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{studentId}, double.class);
    }

    @Override
    public List<Mark> getAllMarksByStudent(int studentId) {
        String sql = "select * from marks where student_id = ?";
        return jdbcTemplate.query(sql, new Object[]{studentId},
                new BeanPropertyRowMapper<>(Mark.class));
    }

    @Override
    public List<Mark> getAllMarksByDiscipline(int disciplieId) {
        String sql = "select * from marks where discipline_id = ?";
        return jdbcTemplate.query(sql, new Object[]{disciplieId},
                new BeanPropertyRowMapper<>(Mark.class));
    }

    @Override
    public List<Mark> getAllMakrs() {
        String sql = "Select * from marks";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Mark.class));
    }
}
