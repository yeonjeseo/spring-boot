package com.example.demo.controller;

import com.example.demo.dto.board.BoardDto;
import com.example.demo.dto.board.CreateBoardRequestDto;
import com.example.demo.dto.board.UpdateBoardRequestDto;
import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
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
    public List<BoardDto> getAllBoardsController() {
        return boardService.getAllBoards();
    }

    @PostMapping("")
    public String postBoard(
            @Valid
            @RequestBody CreateBoardRequestDto createBoardRequestDto
    ) {
        boardService.createBoard(createBoardRequestDto);
        return "ok";
    }

    @DeleteMapping("/{boardId}")
    public String deleteBoard(
            @PathVariable Integer boardId
    ) {
        return boardService.deleteBoardById(boardId);
    }

    @PutMapping("/{boardId}")
    public Board updateBoard(
            @PathVariable Integer boardId,
            @Valid @RequestBody UpdateBoardRequestDto updateBoardRequestDto
            ) {
        return boardService.updateBoardById(boardId, updateBoardRequestDto);
    }
}
