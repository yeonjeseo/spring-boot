package com.example.demo.service;

import com.example.demo.dto.BoardDto;
import com.example.demo.dto.CreateBoardRequestDto;
import com.example.demo.dto.UpdateBoardRequestDto;
import com.example.demo.entity.Board;

import java.util.List;
import java.util.Optional;

public interface BoardService {
    List<BoardDto> getAllBoards();

    void createBoard(CreateBoardRequestDto createBoardRequestDto);

    String deleteBoardById(Integer id);

    Board updateBoardById(Integer boardId, UpdateBoardRequestDto updateBoardRequestDto);
}
