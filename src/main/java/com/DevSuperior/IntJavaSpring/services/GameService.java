package com.DevSuperior.IntJavaSpring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DevSuperior.IntJavaSpring.dto.GameMinDTO;
import com.DevSuperior.IntJavaSpring.entities.Game;
import com.DevSuperior.IntJavaSpring.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
		
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
}
