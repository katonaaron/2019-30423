package com.scheduler.backend.repository;

import java.util.List;

public interface Repository<T, ID> {
    T save(T obj);
    T findById(ID id);
    void delete(T obj);
    List<T> findAll();
}
