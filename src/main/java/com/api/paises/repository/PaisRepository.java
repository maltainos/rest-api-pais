package com.api.paises.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.paises.entity.Pais;

/**
 * @see JpaRepository
 * @author Nelson Zaona Joao Albino
 *
 */
public interface PaisRepository extends JpaRepository<Pais, Long> {

}
