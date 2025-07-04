package com.br.quest.controller;

import java.util.List;
import com.br.quest.model.Board;
import com.br.quest.service.BoardService;
import com.br.quest.utils.BoardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
@CrossOrigin("*")
public class BoardController {

    @Autowired
    BoardService boardService;

    @PostMapping("/cadastro")
    @ResponseBody
    public String cadastrarAtualizar(@RequestBody BoardDto board) {
        Board newBoard = new Board();
        newBoard.setTitulo(board.titulo().toString());
        return boardService.saveUpdateBoard(newBoard);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer idBoard) {
        return boardService.deleteBoard(idBoard);
    }

    @GetMapping("/todos")
    public List<Board> getAllBoards() {
        return boardService.getAllBoards();
    }

}