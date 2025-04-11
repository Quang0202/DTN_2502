package dao;

import model.Department;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    List<T> getAll();

    Optional<T> findById(int id);

    List<T> findByName(String name);

    void save(T t);

    void update(T t);

    void delete(T t);
}
