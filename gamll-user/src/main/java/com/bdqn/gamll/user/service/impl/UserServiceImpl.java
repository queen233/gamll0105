package com.bdqn.gamll.user.service.impl;

import com.bdqn.gamll.bean.UmsMember;
import com.bdqn.gamll.bean.UmsMemberReceiveAddress;
import com.bdqn.gamll.service.UserService;
import com.bdqn.gamll.user.mapper.UmsMemberReceiveAddressMapper;
import com.bdqn.gamll.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getUserAll() {
        List<UmsMember> umsMemberList = userMapper.selectAll();//userMapper.selectALlUser();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {

        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);

       /* Example e=new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("memberId",memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(e);*/
        return umsMemberReceiveAddressList;
    }
}
