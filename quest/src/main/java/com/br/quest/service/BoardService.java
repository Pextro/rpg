package com.br.quest.service;

import java.util.List;
import com.br.quest.model.Board;
import com.br.quest.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BoardService {

    @Autowired
    private BoardRepository boardDao;

    public  String saveUpdateBoard(Board board){
        try {

            boardDao.saveAndFlush(board);
            return "Sucesso";

        }catch (Exception e){
            return e.getMessage();
        }
    }

    public String deleteBoard(Integer boardId){
        try {

            boardDao.deleteById(boardId);
            return "Sucesso";

        }catch (Exception e){
            return e.getMessage();
        }
    }

    public List<Board> getAllBoards() {
        return boardDao.findAll();
    }

}
