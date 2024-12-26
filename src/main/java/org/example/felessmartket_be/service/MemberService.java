package org.example.felessmartket_be.service;

import lombok.RequiredArgsConstructor;
import org.example.felessmartket_be.domain.Member;
import org.example.felessmartket_be.domain.dto.MemberRequestDto;
import org.example.felessmartket_be.repository.MemberRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;


    public Member create(MemberRequestDto memberRequestDto) {
        Member newMember = new Member();
        newMember.setUserId(memberRequestDto.getUserId());
        newMember.setName(memberRequestDto.getName());
        newMember.setEmail(memberRequestDto.getEmail());
        newMember.setPhone(memberRequestDto.getPhone());
        newMember.setPassword(passwordEncoder.encode(memberRequestDto.getPassword()));
        System.out.println(newMember);
        memberRepository.save(newMember);
        return newMember;
    }

    public boolean checkEmailDuplicate(String email) {
        return memberRepository.existsByEmail(email);
    }
    public boolean checkIdDuplicate(String userId) {
        return memberRepository.existsByUserId(userId);
    }

}
