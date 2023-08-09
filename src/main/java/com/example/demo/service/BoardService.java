package com.example.demo.service;

import com.example.demo.dto.BoardResponseDto;

import java.util.List;

public interface BoardService {
    List<BoardResponseDto> getAllBoards();
}
