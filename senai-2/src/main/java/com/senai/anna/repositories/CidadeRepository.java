package com.senai.anna.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.anna.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}