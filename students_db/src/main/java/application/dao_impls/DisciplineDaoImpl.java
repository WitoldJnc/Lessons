package application.dao_impls;

import application.dao_interfaces.DisciplinesDao;
import application.models.Discipline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DisciplineDaoImpl extends GenericDaoImpl<Discipline> implements DisciplinesDao {

    public DisciplineDaoImpl() {
        table = "disciplines";
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    protected Map<String, Object> insertParams(Discipline entity) {
        Map<String, Object> params = new HashMap<>();
        params.put("discipline_name", entity.getDisciplineName());
        return params;
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

}
