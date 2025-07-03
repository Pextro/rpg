package com.br.quest.controller;

import com.br.quest.model.Character;
import com.br.quest.service.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Character")
@RequiredArgsConstructor
@CrossOrigin("*")
public class CharacterController {

    @Autowired
    CharacterService characterService;

    @PostMapping("/cadastro")
    @ResponseBody
    public String cadastrarAtualizar(@RequestBody Character character) {
        return characterService.saveUpdateCharacter(character);
    }

    @DeleteMapping("/deletar/{id}")
    public String deleteCharacter(@PathVariable Integer idCharacter) {
        return characterService.deleteCharacter(idCharacter);
    }

    @GetMapping("/todos")
    public List<Character> getAllCharacters() {
        return characterService.getAllCharacters();
    }


}
