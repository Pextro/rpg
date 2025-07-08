package com.br.quest.repository;

import com.br.quest.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface BoardRepository extends JpaRepository<Board,Integer>  {

}
