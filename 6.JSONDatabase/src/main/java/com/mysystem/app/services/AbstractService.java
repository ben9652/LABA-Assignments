package com.mysystem.app.services;

import java.util.List;

import com.mysystem.app.interfaces.GenericDAO;
import com.mysystem.app.interfaces.GenericService;

public abstract class AbstractService<T, ID> implements GenericService<T, ID> {
    protected GenericDAO<T, ID> dao;

    public AbstractService(GenericDAO<T, ID> dao) {
        this.dao = dao;
    }

    @Override
    public void save(T entity) {
        dao.create(entity);
    }

    @Override
    public T getById(ID id) {
        return dao.findById(id);
    }

    @Override
    public List<T> getAll() {
        return dao.findAll();
    }

    @Override
    public void modify(T entity) {
        dao.update(entity);
    }

    @Override
    public void remove(T entity) {
        dao.delete(entity);
    }
}
