package com.mysystem.app.interfaces;

import java.util.List;

public interface GenericDAO<T, ID> {
    void create(T entity);
    T findById(ID id);
    List<T> findAll();
    void update(T entity);
    void delete(T entity);
}
