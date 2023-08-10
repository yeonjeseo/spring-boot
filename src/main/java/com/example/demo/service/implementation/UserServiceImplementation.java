package com.example.demo.service.implementation;

import com.example.demo.dto.board.CreateUserRequestDto;
import com.example.demo.dto.user.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Component
public class UserServiceImplementation  implements UserService {
    private final UserRepository userRepository;
    public UserDto findUserById(Integer userId) {
        User foundUser =  userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found!"));

        return new UserDto(foundUser.getId(), foundUser.getName(), foundUser.getEmail());
    }

    public void registerUser(CreateUserRequestDto createUserRequestDto) {
        userRepository.save(new User(createUserRequestDto.getName(), createUserRequestDto.getEmail(), createUserRequestDto.getPassword()));
    }
}
