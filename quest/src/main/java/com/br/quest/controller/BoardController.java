package com.br.quest.controller;

import com.br.quest.model.Board;
import com.br.quest.service.BoardService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/Board")
@RequiredArgsConstructor
@CrossOrigin("*")
public class BoardController {

    @Autowired
    BoardService boardService;

    @PostMapping("/cadastro")
    @ResponseBody
    public String cadastrarAtualizar(@RequestBody Board board) {
        return boardService.saveUpdateBoard(board);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer idBoard) {
        return boardService.delete(idBoard);
    }
}