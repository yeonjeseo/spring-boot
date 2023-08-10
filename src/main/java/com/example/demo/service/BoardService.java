package com.example.demo.service;

import com.example.demo.dto.board.BoardDto;
import com.example.demo.dto.board.CreateBoardRequestDto;
import com.example.demo.dto.board.UpdateBoardRequestDto;
import com.example.demo.entity.Board;

import java.util.List;

public interface BoardService {
    List<BoardDto> getAllBoards();

    void createBoard(CreateBoardRequestDto createBoardRequestDto);

    String deleteBoardById(Integer id);

    Board updateBoardById(Integer boardId, UpdateBoardRequestDto updateBoardRequestDto);
}
