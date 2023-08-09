package com.example.demo.dto;

import lombok.*;

@Data
@NoArgsConstructor
public class BoardResponseDto {

    private Integer id;
    private String title;

    @Builder
    public BoardResponseDto(String title) {
        this.title = title;
    }
}
