package com.sitech.tc.influencesystem.mapper;

import com.sitech.tc.influencesystem.pojo.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author JYH
 * 2019/2/27 10:02
 */

public interface UserMapper extends Mapper<User> {
    String selectQuestionByUsername(String username);
}