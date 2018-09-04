package com.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseDao<T> {
    T get(Serializable id);

    List<T> find(Map map);

    void insert(T entity);

    void update(T entity);

    void deleteById(Serializable id);

    void deleteById(Serializable[] ids);
}
