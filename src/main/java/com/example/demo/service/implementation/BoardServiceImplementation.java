package com.example.demo.service.implementation;

import com.example.demo.dto.BoardResponseDto;
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
    public List<BoardResponseDto> getAllBoards() {

        List<Board> all = boardRepository.findAll();
        List<BoardResponseDto> boardList = new ArrayList<>();

        for(Board board: all) {
            BoardResponseDto boardDto = BoardResponseDto.builder().title(board.getTitle()).build();

            boardList.add(boardDto);
        }

        return boardList;
    }
}
