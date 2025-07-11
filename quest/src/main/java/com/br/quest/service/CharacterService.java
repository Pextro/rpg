package com.br.quest.service;

import java.util.List;

import com.br.quest.model.Quest;
import com.br.quest.repository.CharacterRepository;
import com.br.quest.utils.CharacterDto;
import com.br.quest.utils.QuestDto;
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

    public Character findCharacterByNick(String nick) {
        return characterDao.findByNick(nick);
    }
    public void save(CharacterDto characterDto) {
        Character character = new Character();
        character.setNick(characterDto.nick());
        character.setLevel(characterDto.level());
        character.setClasse(characterDto.classe());
        character.setSubClass(characterDto.subClasse());
        character.setRanking(characterDto.ranking());

        characterDao.saveAndFlush(character);
    }

}
