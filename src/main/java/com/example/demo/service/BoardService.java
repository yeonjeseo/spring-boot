package com.example.demo.service;

import com.example.demo.dto.BoardResponseDto;
import com.example.demo.dto.CreateBoardRequestDto;

import java.util.List;

public interface BoardService {
    List<BoardResponseDto> getAllBoards();

    void createBoard(CreateBoardRequestDto createBoardRequestDto);
}
