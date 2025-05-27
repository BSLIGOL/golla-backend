package com.golla.golla.dao;

import com.golla.golla.dto.MemberDTO;

public interface MemberDAO {
    MemberDTO findByUserIdAndPassword(String userId, String password);
}
