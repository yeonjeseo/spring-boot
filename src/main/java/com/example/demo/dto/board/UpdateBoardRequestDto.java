package com.example.demo.dto.board;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;

@NoArgsConstructor
@Getter
public class UpdateBoardRequestDto {

    @NotNull
    private String title;
    @NotNull
    private String content;


    @Builder
    public UpdateBoardRequestDto(String title, String content){
        this.title = title;
        this.content = content;
    }

}
