package com.ederson.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ederson.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository <Movie, Long>{

}
