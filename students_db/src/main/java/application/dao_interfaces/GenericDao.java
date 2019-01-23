package application.dao_interfaces;

import java.util.List;

public interface GenericDao<T> {

    Integer insert(T object);

    Integer getCount();

    void deleteById(Integer id);

    T getById(Integer id);

    List<T> getAll();

}
