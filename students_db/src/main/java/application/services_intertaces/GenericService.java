package application.services_intertaces;

import application.models.Student;

import java.util.List;

public interface GenericService<T> {

    void insert(T t);

    void deleteById(int id);

    int getCount();

    T getbyId(int id);

    List<T> getAll();


}
