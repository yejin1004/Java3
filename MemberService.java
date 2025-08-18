public class MemberService {
package com.example.library.service;

import com.example.library.domain.Member;
import com.example.library.dto.MemberDTO;
import com.example.library.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
}

@service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;

    public void register(MemberDTO dto) {
        // 중복 이메일 체크
        if (memberMapper.findByEmail(dto.getEmail()) != null) {
            throw new RuntimeException("이미 사용 중인 이메일입니다.");
        }

