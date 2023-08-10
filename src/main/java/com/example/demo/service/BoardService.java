package com.example.demo.service;

import com.example.demo.dto.BoardDto;
import com.example.demo.dto.CreateBoardRequestDto;

import java.util.List;

public interface BoardService {
    List<BoardDto> getAllBoards();

    void createBoard(CreateBoardRequestDto createBoardRequestDto);
}
