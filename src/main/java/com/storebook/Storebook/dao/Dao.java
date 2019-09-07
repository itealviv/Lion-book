package com.storebook.Storebook.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    T getById(int id);

    List<T> getAll();

    void save(T t);

    void update(T t);

    void delete(T t);


}
