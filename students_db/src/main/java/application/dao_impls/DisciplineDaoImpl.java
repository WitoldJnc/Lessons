package application.dao_impls;

import application.dao_interfaces.DisciplinesDao;
import application.models.Disciplines;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Qualifier("disciplineDao")
public class DisciplineDaoImpl implements DisciplinesDao {
    private String sql;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertDiscipline(Disciplines disciplines) {
        sql = "insert into discipline (discipline_id, discipline_name) values (?, ?);";
        jdbcTemplate.update(sql, disciplines.getId(), disciplines.getName());
    }


    @Override
    public int getCount() {
        sql = "select count(*) from discipline";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }


    @Override
    public void deleteDisciplineById(int id) {
        sql = "delete from discipline where discipline_id =?;";
        jdbcTemplate.update(sql, id);
    }


    @Override
    public void updateDisciplineName(int id, String newName) {
        sql = "update discipline set discipline_name = ? where discipline_id = ?;";

        jdbcTemplate.update(sql, newName, id);
    }


    @Override
    public List<Disciplines> getDisciplineListByName(String name) {
        sql = "select * from discipline where discipline_name like (?);";
        return jdbcTemplate.query(sql, new Object[]{name + "%"}, new DisciplineRow());
    }


    @Override
    public Disciplines getDisciplinebyId(int id) {
        sql = "select * from discipline where discipline_id = ?";
        return jdbcTemplate.queryForObject(sql,
                new Object[]{id}, new DisciplineRow());
    }


    @Override
    public List<Disciplines> getAllDisciplines() {
        String sql = "Select * from discipline";
        return jdbcTemplate.query(sql, new DisciplineRow());
    }


    private static final class DisciplineRow implements RowMapper<Disciplines> {

        @Override
        public Disciplines mapRow(ResultSet rs, int rowNum) throws SQLException {
            Disciplines disciplines = new Disciplines();
            disciplines.setId(rs.getInt("discipline_id"));
            disciplines.setName(rs.getString("discipline_name"));
            return disciplines;
        }
    }
}
