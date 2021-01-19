package com.innova.repository;

import com.innova.domain.Inquilino;

import java.util.Optional;

public interface InquilinoRepo extends AbstractRepo<Inquilino>{

    Optional<Inquilino> findByName(String name);
}
