package com.DevSuperior.IntJavaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.DevSuperior.IntJavaSpring.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

	
	
}
