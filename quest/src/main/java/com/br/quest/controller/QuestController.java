package com.br.quest.controller;

import java.util.List;

import com.br.quest.model.Board;
import com.br.quest.model.Quest;
import com.br.quest.service.QuestService;
import com.br.quest.utils.QuestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/quest")
@RequiredArgsConstructor
@CrossOrigin("*")
public class QuestController {

    @Autowired
    QuestService questService;

    @PostMapping("/cadastro")
    @ResponseBody
    public String cadastrarAtualizar(@RequestBody QuestDto questDto) {
        questService.save(questDto);
        return ("Salvo com sucesso");
    }

    @DeleteMapping("/deletar/{id}")
    public String deleteQuast(@PathVariable Integer idQuest) {

        return questService.deleteQuast(idQuest);
    }

    @GetMapping("/todos")
    public List<Quest> getAllQuests() {

        return questService.getAllQuests();
    }

    @GetMapping("/find/titulo/{titulo}")
    public ResponseEntity<Quest> getQuestByTitulo(@PathVariable String titulo) {
        return questService.getQuestByTitulo(titulo)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


}
