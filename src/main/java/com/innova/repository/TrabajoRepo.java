package com.innova.repository;

import com.innova.domain.Trabajo;

import java.util.List;
import java.util.Optional;

public interface TrabajoRepo  extends AbstractRepo<Trabajo>{

    Optional<Trabajo> findByPhone(String phone);

    List<Trabajo>findAll();
    Optional<Trabajo> findById(long id);
}
