package com.bdqn.gamll.user.service;

import com.bdqn.gamll.user.bean.UmsMember;
import com.bdqn.gamll.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getUserALl();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
