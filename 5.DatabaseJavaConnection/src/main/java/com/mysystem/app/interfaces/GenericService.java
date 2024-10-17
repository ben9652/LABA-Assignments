package com.mysystem.app.interfaces;

import java.util.List;

public interface GenericService<T, ID> {
    void save(T entity);
    T getById(ID id);
    List<T> getAll();
    void modify(T entity);
    void remove(T entity);
}
