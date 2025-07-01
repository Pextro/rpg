package com.br.quest.controller;


import com.br.quest.model.Quest;
import com.br.quest.service.QuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Quest")
@RequiredArgsConstructor
@CrossOrigin("*")

public class QuestController {

    @Autowired
    QuestService questService;

    @PostMapping("/cadastro")
    @ResponseBody
    public String cadastrarAtualizar(@RequestBody Quest quest) {
        return questService.saveUpdate(quest);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer idQuest) {
        return questService.delete(idQuest);
    }
}
