package com.senai.anna.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.anna.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}