package com.ederson.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ederson.dsmovie.entities.User;

public interface UserRepository extends JpaRepository <User, Long>{

	User findByEmail(String email);
}
