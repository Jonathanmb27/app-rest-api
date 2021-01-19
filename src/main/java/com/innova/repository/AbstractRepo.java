package com.innova.repository;

import com.innova.domain.AbstractEntity;

import java.util.Optional;

public interface AbstractRepo <T extends AbstractEntity>{
    void save(T entity);

    void delete(T entity);

    int deleteById(Long entityId);

    Optional<T> findById(Long entityId);
}
