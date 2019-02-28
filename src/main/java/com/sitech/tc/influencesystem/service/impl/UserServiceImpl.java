package com.sitech.tc.influencesystem.service.impl;

import com.sitech.tc.influencesystem.mapper.UserMapper;
import com.sitech.tc.influencesystem.pojo.User;
import com.sitech.tc.influencesystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * @author JYH
 * 2019/2/28 10:57
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean queryUsernameIsExist(String username) {
        User user = new User();
        user.setUsername(username);
        User result =  userMapper.selectOne(user);
        return result == null ? false : true;
    }

    @Override
    public User queryUserForLogin(String username, String password) {
        Example userExample = new Example(User.class);
        Example.Criteria criteria = userExample.createCriteria();
        criteria.andEqualTo("username", username);
        criteria.andEqualTo("password", password);
        User result = userMapper.selectOneByExample(userExample);

        return result;
    }
}
