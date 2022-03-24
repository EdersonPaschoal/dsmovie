package com.ederson.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ederson.dsmovie.entities.Score;
import com.ederson.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository <Score, ScorePK>{

}
