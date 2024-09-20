package com.lumierebuds.boards.member.controller;

import com.lumierebuds.boards.member.model.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService service;

    // 로그인 페이지 이동
    @GetMapping("/login")
    public String loginPage () {
        return "member/login";
    }

}
