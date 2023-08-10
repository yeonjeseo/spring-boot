package com.example.demo.service;

import com.example.demo.dto.board.CreateUserRequestDto;
import com.example.demo.dto.user.UserDto;

public interface UserService {
    UserDto findUserById(Integer userId);

    void registerUser(CreateUserRequestDto createUserRequestDto);
}
