package application.dao_impls;

import application.dao_interfaces.GenericDao;
import application.models.AnyObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public abstract class GenericDaoImpl<T extends AnyObject> implements GenericDao<T> {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    protected String table;
    protected String columnId;

    @Override
    public void deleteById(Integer id) {
        String sql = "DELETE FROM " + table + " WHERE " + columnId + " =?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public Integer getCount() {
        String sql = "SELECT COUNT(*) FROM " + table;
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public T getById(Integer id) {
        String sql = "Select * from " + table + " where " + columnId + " =?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(genericClass));
    }

    @Override
    public List<T> getAll() {
        String sql = "select * from " + table;
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(genericClass));
    }

    protected abstract Map<String, Object> insertParams(T entity);

    @Override
    public Integer insert(T object) {
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
        jdbcInsert.withTableName(table).usingGeneratedKeyColumns(columnId);
        return jdbcInsert.executeAndReturnKey(new MapSqlParameterSource(insertParams(object))).intValue();
    }

    private Class<T> genericClass = (Class<T>) ((ParameterizedType) getClass()
            .getGenericSuperclass()).getActualTypeArguments()[0];
}
