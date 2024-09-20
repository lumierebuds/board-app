package com.lumierebuds.boards.member.model.service;


import com.lumierebuds.boards.member.model.dao.MemberDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberDao dao;

    @Override
    public int findMemberById() {
        return 0;
    }
}
