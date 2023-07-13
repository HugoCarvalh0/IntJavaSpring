package com.DevSuperior.IntJavaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.DevSuperior.IntJavaSpring.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
