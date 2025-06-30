package com.br.quest.repository;

import com.br.quest.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board,Integer>  {

}
