package com.example.demo.dto.board;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;

@NoArgsConstructor
@Getter
public class CreateUserRequestDto {

    @NotNull
    private String name;

    @NotNull
    @Email
    private String email;

    @NotNull
    private String password;

    @Builder
    public CreateUserRequestDto(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }

}
