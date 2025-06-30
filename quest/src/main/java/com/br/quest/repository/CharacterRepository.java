package com.br.quest.repository;

import com.br.quest.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character,Integer>  {

}
