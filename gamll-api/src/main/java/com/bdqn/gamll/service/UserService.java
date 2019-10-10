package com.bdqn.gamll.service;


import com.bdqn.gamll.bean.UmsMember;
import com.bdqn.gamll.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getUserAll();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
