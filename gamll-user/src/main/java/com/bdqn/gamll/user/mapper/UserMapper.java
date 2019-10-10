package com.bdqn.gamll.user.mapper;

import com.bdqn.gamll.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectALlUser();
}
