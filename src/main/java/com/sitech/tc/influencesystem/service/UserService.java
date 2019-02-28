package com.sitech.tc.influencesystem.service;

import com.sitech.tc.influencesystem.pojo.User;

/**
 * @author JYH
 * 2019/2/28 10:57
 */
public interface UserService {

    /**
     * @Description: 判断用户名是否存在
     * @param username
     * @return
     */
    boolean queryUsernameIsExist(String username);


    /**
     * @Description: 用户登录，根据用户名和密码查询用户
     * @param username
     * @param password
     * @return
     */
    User queryUserForLogin(String username, String password);
}
