package com.br.quest.repository;

import com.br.quest.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CharacterRepository extends JpaRepository<Character,Integer>  {

    Character findByNick(String nick);

}
