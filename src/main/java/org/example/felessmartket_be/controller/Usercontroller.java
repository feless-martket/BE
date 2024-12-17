package org.example.felessmartket_be.controller;

import lombok.AllArgsConstructor;
import org.example.felessmartket_be.domain.User;
import org.example.felessmartket_be.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class Usercontroller {
    private final UserRepository userRepository;

    @PostMapping("")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }


}
