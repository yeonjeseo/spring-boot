package com.example.demo.dto.board;

import lombok.*;

@Data
@NoArgsConstructor
public class BoardDto {

    private Integer id;
    private String title;
    private String content;

    @Builder
    public BoardDto(String title, String content, Integer id) {
        this.title = title;
        this.content = content;
        this.id = id;
    }
}
