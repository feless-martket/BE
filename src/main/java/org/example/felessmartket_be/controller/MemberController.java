package org.example.felessmartket_be.controller;

import jakarta.validation.Valid;
import java.util.List;
import lombok.AllArgsConstructor;
import org.example.felessmartket_be.domain.Member;
import org.example.felessmartket_be.domain.dto.MemberRequestDto;
import org.example.felessmartket_be.domain.dto.MemberResponseDto;
import org.example.felessmartket_be.repository.MemberRepository;
import org.example.felessmartket_be.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class MemberController {

    private final MemberService memberService;
    private final MemberRepository memberRepository;

    @GetMapping("")
    public List<Member> readMember() {
        return memberRepository.findAll();
    }

    @PostMapping("/signup")
    public ResponseEntity<MemberResponseDto> createMember(@RequestBody @Valid MemberRequestDto entity) {
        Member createMember = memberService.create(entity);
        MemberResponseDto memberResponseDto = MemberResponseDto.from(createMember);
        return ResponseEntity.status(HttpStatus.OK).body(memberResponseDto);
    }

    @GetMapping("/email")
    public ResponseEntity<Boolean> validateEmail(@RequestParam(value = "e") String email) {
        return ResponseEntity.ok(memberService.checkEmailDuplicate(email));
        // 이메일 중복 체크
        // true - 중복되는 이메일 있음
        // false - 중복되는 이메일 없음
    }
    @GetMapping("id")
    public ResponseEntity<Boolean> validateID(@RequestParam(value = "id") String userId) {
        return ResponseEntity.ok(memberService.checkIdDuplicate(userId));
        // 이메일과 동일
    }


}
