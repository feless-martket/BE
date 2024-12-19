package org.example.felessmartket_be.controller;

import java.util.List;
import lombok.AllArgsConstructor;
import org.example.felessmartket_be.domain.User;
import org.example.felessmartket_be.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @GetMapping("")
    public List<User> createUser() {
        return userRepository.findAll();
    }


}
