package com.auala04.filmes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.auala04.filmes.models.FilmeModel;

@Repository
public interface FilmeRepository extends JpaRepository<FilmeModel, Integer>{

}
