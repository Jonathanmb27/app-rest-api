package com.innova.repository.impl;

import com.innova.domain.AbstractEntity;
import com.innova.repository.AbstractRepo;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Optional;

public abstract class AbstractRepoImpl<T extends AbstractEntity>implements AbstractRepo<T> {

    protected JdbcTemplate jdbcTemplate;

    protected AbstractRepoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
    @Override
    public void save(T entity) {

    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public int deleteById(Long entityId) {
        return 0;
    }

    @Override
    public Optional<T> findById(Long entityId) {
        return Optional.empty();
    }
}
