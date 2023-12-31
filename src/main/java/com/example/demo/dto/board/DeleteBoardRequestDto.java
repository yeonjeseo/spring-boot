package com.example.demo.dto.board;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class DeleteBoardRequestDto {
    @NotNull
    private Integer boardId;
}
