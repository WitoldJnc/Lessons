package application.dao_impls;

import application.dao_interfaces.GroupDisciplineDao;
import application.models.GroupDiscipline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GroupDisciplineDaoImpl implements GroupDisciplineDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(GroupDiscipline groupDiscipline) {
        String sql = "insert into group_discipline (group_id, discipline_id) VALUES (?, ?);";
        jdbcTemplate.update(sql, groupDiscipline.getGroupId(), groupDiscipline.getDisciplineId());

    }

    @Override
    public void updateGroupByDiscipline(int groupId, int disciplineId) {
        String sql = "update group_discipline set group_id = ? where discipline_id = ?;";
        jdbcTemplate.update(sql, groupId, disciplineId);
    }

    @Override
    public void updateDisciplineByGroup(int disciplineId, int groupId) {
        String sql = "update group_discipline set discipline_id = ? where group_id = ?;";
        jdbcTemplate.update(sql, disciplineId, groupId);
    }

    @Override
    public void deleteByGroupId(int groupId) {
        String sql = "delete from group_discipline where group_id = ?;";
        jdbcTemplate.update(sql, groupId);
    }

    @Override
    public void deleteByDisciplineId(int disciplineId) {
        String sql = "delete from group_discipline where discipline_id = ?;";
        jdbcTemplate.update(sql, disciplineId);
    }

    @Override
    public int getDisciplineCountByGroup(int groupId) {
        String sql = "select count(*) from group_discipline where discipline_id = ?;";
        return jdbcTemplate.queryForObject(sql, new Object[]{groupId}, Integer.class);
    }

    @Override
    public int getGroupCountByDiscipline(int disciplineId) {
        String sql = "select count(*) from group_discipline where group_id = ?;";
        return jdbcTemplate.queryForObject(sql, new Object[]{disciplineId}, Integer.class);
    }

    @Override
    public List<GroupDiscipline> getAll() {
        String sql = "select * from group_discipline;";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(GroupDiscipline.class));
    }


    @Override
    public List<GroupDiscipline> getByGroupId(int groupId) {
        String sql = "select * from group_discipline where group_id = ?";
        return jdbcTemplate.query(sql, new Object[]{groupId},
                new BeanPropertyRowMapper<>(GroupDiscipline.class));
    }

    @Override
    public List<GroupDiscipline> getByDisciplineId(int disciplineId) {
        String sql = "select * from group_discipline where discipline_id = ?";
        return jdbcTemplate.query(sql, new Object[]{disciplineId},
                new BeanPropertyRowMapper<>(GroupDiscipline.class));
    }
}