package application.dao_impls;

import application.dao_interfaces.MarkDao;
import application.models.Mark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MarkDaoImpl extends GenericDaoImpl<Mark> implements MarkDao {

    public MarkDaoImpl() {
        table = "marks";
        columnId = "mark_id";
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void updateMark(int markId, int newMark) {
        String sql = "update marks set mark = :? where mark_id = ?;";
        jdbcTemplate.update(sql, newMark, markId);
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
    protected Map<String, Object> insertParams(Mark entity) {
        Map<String, Object> params = new HashMap<>();
        params.put("mark", entity.getMark());
        params.put("discipline_id", entity.getDisciplineId());
        params.put("student_id", entity.getStudentId());
        return params;
    }
}
