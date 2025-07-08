package com.br.quest.repository;

import com.br.quest.model.Character;
import com.br.quest.model.Quest;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface QuestRepository extends JpaRepository<Quest,Integer>  {

    Optional<Quest> findByTitulo(String titulo);
    //Character findByCharacter(String)//
}
