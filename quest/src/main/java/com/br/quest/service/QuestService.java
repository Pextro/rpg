package com.br.quest.service;

import java.util.List;
import com.br.quest.model.Quest;
import com.br.quest.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class QuestService {

    @Autowired
    private QuestRepository questDao;

    public  String saveUpdateQuast(Quest quest ){
        try {

            questDao.saveAndFlush(quest);
            return "Sucesso";

        }catch (Exception e){
            return e.getMessage();
        }
    }

    public String deleteQuast(Integer idQuast){
        try {

            questDao.deleteById(idQuast);
            return "Sucesso";

        }catch (Exception e){
            return e.getMessage();
        }
    }
    public List<Quest> getAllQuests() {
        return questDao.findAll();
    }
}
