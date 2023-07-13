package com.DevSuperior.IntJavaSpring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DevSuperior.IntJavaSpring.dto.GameDTO;
import com.DevSuperior.IntJavaSpring.dto.GameMinDTO;
import com.DevSuperior.IntJavaSpring.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{Id}")
	public GameDTO findByID(@PathVariable Long Id){
		GameDTO result = gameService.findById(Id);
		return result;
	}
}
