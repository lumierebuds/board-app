package com.lumierebuds.boards.member.model.dao;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberDaoImpl implements MemberDao {
    private final SqlSessionTemplate session;


}
