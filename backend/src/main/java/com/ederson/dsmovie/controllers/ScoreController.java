package com.ederson.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ederson.dsmovie.dto.MovieDTO;
import com.ederson.dsmovie.dto.ScoreDTO;
import com.ederson.dsmovie.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {	
	
	@Autowired
	private ScoreService service;
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
		MovieDTO movieDTO = service.saveScore(dto);
		return movieDTO;
		}
}
