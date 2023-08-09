package com.example.demo.controller;

import com.example.demo.dto.BoardResponseDto;
import com.example.demo.dto.CreateBoardRequestDto;
import com.example.demo.service.BoardService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/boards")
public class BoardController {

    private final BoardService boardService;

//    lombok 을 사용하지 않을 경우, 생성자를 직접 구현해줘야 함.
//    public PostController(PostService boardService) {
//        this.boardService = boardService;
//    }

    @GetMapping("")
    public List<BoardResponseDto> getAllBoardsController() {
        return boardService.getAllBoards();
    }

    @PostMapping("")
    public String postBoard(
            @Valid
            @RequestBody CreateBoardRequestDto createBoardRequestDto
    ) {
        return "ok";
    }
}
