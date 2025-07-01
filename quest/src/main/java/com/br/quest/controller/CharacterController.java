package com.br.quest.controller;

import com.br.quest.model.Character;
import com.br.quest.service.BoardService;
import com.br.quest.service.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return CharacterService.saveUpdatecharacter(character);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer idCharacter) {
        return CharacterService.delete(idCharacter);
    }
}
