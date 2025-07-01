package com.br.quest.service;

import com.br.quest.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.br.quest.model.Character;

public class CharacterService {

    @Autowired
    private CharacterRepository characterDao;

    public static String saveUpdatecharacter(Character character) {
    }

    public String saveUpdate(Character character) {
        try {

            characterDao.saveAndFlush(character);
            return "Sucesso";

        } catch (Exception e){
            return e.getMessage();
        }
    }
}
