package com.golla.golla.service.impl;

import com.golla.golla.dao.MemberDAO;
import com.golla.golla.dto.MemberDTO;
import com.golla.golla.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberDAO memberDAO;

    @Autowired
    public MemberServiceImpl(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    @Override
    public String login(String userId, String password) {
        //DAO 호출 user_id와 password로 사용자 조회
        MemberDTO member = memberDAO.findByUserIdAndPassword(userId, password);

        if(member!=null) {
            return "some_generated_token";
        } else {
            return null;
        }
    }
}
