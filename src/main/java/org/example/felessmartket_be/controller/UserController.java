package org.example.felessmartket_be.controller;

import java.util.List;
import lombok.AllArgsConstructor;
import org.example.felessmartket_be.domain.Member;
import org.example.felessmartket_be.repository.MemberRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    private final MemberRepository memberRepository;

    @GetMapping("")
    public List<Member> createUser() {
        return memberRepository.findAll();
    }
}
