public class MemberController {
package com.example.library.controller;

import com.example.library.dto.MemberDTO;
import com.example.library.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/api/members")
    @RequiredArgsConstructor
    public class MemberController {

        private final MemberService memberService;

        @PostMapping("/register")
        public String register(@RequestBody MemberDTO dto) {
            memberService.register(dto);
            return "회원가입 성공!";
        }
    }

