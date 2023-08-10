package com.example.demo.controller;

import com.example.demo.dto.board.CreateUserRequestDto;
import com.example.demo.dto.user.UserDto;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @GetMapping("/{userId}")
    public UserDto findOneUserById(
            @PathVariable Integer userId
    ) {
        return userService.findUserById(userId);
    }

    @PostMapping("")
    public String registerUser(
            @Valid @RequestBody CreateUserRequestDto createUserRequestDto
            ){
        userService.registerUser(createUserRequestDto);
        return "User Registered!";
    }
}
