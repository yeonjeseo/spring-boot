package com.example.demo.service.implementation;

import com.example.demo.dto.board.BoardDto;
import com.example.demo.dto.board.CreateBoardRequestDto;
import com.example.demo.dto.board.UpdateBoardRequestDto;
import com.example.demo.entity.Board;
import com.example.demo.repository.BoardRepository;
import com.example.demo.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
@RequiredArgsConstructor
public class BoardServiceImplementation implements BoardService {
    private final BoardRepository boardRepository;

    @Override
    public List<BoardDto> getAllBoards() {

        List<Board> all = boardRepository.findAll();
        List<BoardDto> boardList = new ArrayList<>();

        for(Board board: all) {
            BoardDto boardDto = BoardDto.builder().title(board.getTitle()).content(board.getContent()).id(board.getId()).build();

            boardList.add(boardDto);
        }

        return boardList;
    }

    @Override
    public void createBoard(CreateBoardRequestDto createBoardRequestDto) {
        boardRepository.save(new Board(createBoardRequestDto.getTitle(), createBoardRequestDto.getContent()));
    }

    @Override
    public String deleteBoardById(Integer id) {
        boardRepository.deleteById(id);
        return "Successfully deleted a board!";
    }

    @Override
    public Board updateBoardById(
            Integer boardId,
            UpdateBoardRequestDto updateBoardRequestDto
    ) {
        Board board = boardRepository.findById(boardId).orElseThrow(() -> new IllegalArgumentException("Board not found!"));


        board.setContent(updateBoardRequestDto.getContent());
        board.setTitle(updateBoardRequestDto.getTitle());

        boardRepository.save(board);

        return board;
    }
}
