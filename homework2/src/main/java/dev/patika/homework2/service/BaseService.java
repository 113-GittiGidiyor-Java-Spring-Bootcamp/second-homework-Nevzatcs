package dev.patika.homework2.service;

import java.util.List;

public interface BaseService<T> {

    List<T> findAll();
    T findById(int id);
    T save(T object);
    void deleteById(int id);
    T updateOnDatabase(T object);
    void delete(T object);
}
