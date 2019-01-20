package application.dao_impls;

import application.dao_interfaces.DisciplinesDao;
import application.models.Discipline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("disciplineDao")
public class DisciplineDaoImpl implements DisciplinesDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insertDiscipline(Discipline discipline) {
        String sql = "insert into disciplines (discipline_id, discipline_name) values (?, ?);";
        jdbcTemplate.update(sql, discipline.getDisciplineId(), discipline.getDisciplineName());
        return discipline.getDisciplineId();
    }

    @Override
    public int getCount() {
        String sql = "select count(*) from disciplines";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public void deleteDisciplineById(int id) {
        String sql = "delete from disciplines where discipline_id =?;";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public void updateDisciplineName(int id, String newName) {
        String sql = "update disciplines set discipline_name = ? where discipline_id = ?;";
        jdbcTemplate.update(sql, newName, id);
    }

    @Override
    public Discipline getDisciplineByName(String name) {
        String sql = "select * from disciplines where discipline_name like (?);";
        return jdbcTemplate.queryForObject(sql, new Object[]{name + "%"}, new BeanPropertyRowMapper<>(Discipline.class));
    }

    @Override
    public int getDisciplineIdByName(String name) {
        String sql = "select discipline_id from disciplines where discipline_name like (?)";
        return jdbcTemplate.queryForObject(sql, new Object[]{name + "%"}, Integer.class);
    }

    @Override
    public List<Discipline> getDisciplinebyId(int id) {
        String sql = "select * from disciplines where discipline_id = ?";
        return jdbcTemplate.query(sql,
                new Object[]{id}, new BeanPropertyRowMapper<>(Discipline.class));
    }

    @Override
    public List<Discipline> getAllDisciplines() {
        String sql = "Select * from disciplines";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Discipline.class));
    }
}
