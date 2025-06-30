package com.br.quest.service;

import com.br.quest.model.Quest;
import com.br.quest.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class QuestService {

    @Autowired
    private QuestRepository questDao;

    public String saveUpdate(Quest quest) {
        try {

            questDao.saveAndFlush(quest);
            return "Sucesso";

        }catch (Exception e){
            return e.getMessage();
        }
    }
}
