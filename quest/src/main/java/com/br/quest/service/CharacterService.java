package com.br.quest.service;

import java.util.List;
import com.br.quest.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.br.quest.model.Character;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterDao;

    public String saveUpdateCharacter(Character character) {
        try {

            characterDao.saveAndFlush(character);
            return "Sucesso";

        } catch (Exception e){
            return e.getMessage();
        }
    }
    public String deleteCharacter(Integer characterId){
        try {

            characterDao.deleteById(characterId);
            return "Sucesso";

        }catch (Exception e){
            return e.getMessage();
        }
    }
    public List<Character> getAllCharacters() {
        return characterDao.findAll();
    }

}
