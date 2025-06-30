package com.br.quest.repository;

import com.br.quest.model.Quest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestRepository extends JpaRepository<Quest,Integer>  {

}
