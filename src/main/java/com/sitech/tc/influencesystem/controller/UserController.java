package com.sitech.tc.influencesystem.controller;

import com.sitech.tc.influencesystem.common.*;
import com.sitech.tc.influencesystem.pojo.User;
import com.sitech.tc.influencesystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.util.StringUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Description 登录控制类
 * @author JYH
 * 2019/2/28 11:12
 */
@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    public RedisOperator redis;

    /**
     * @Description: 用户登录
     */
    @PostMapping("login.do")
    public ServerResponse<User> login(User user, HttpServletResponse httpServletResponse, HttpSession session) throws Exception {
        String username = user.getUsername();
        String password = user.getPassword();

        // 1. 判断用户名和密码必须不为空
        if(StringUtil.isEmpty(username) || StringUtil.isEmpty(password)){
            return ServerResponse.createByErrorMessage("用户名或密码不能为空");
        }

        // 2. 判断用户名是否存在
        boolean result = userService.queryUsernameIsExist(username);
        if(!result){
            return ServerResponse.createByErrorMessage("用户名不存在");
        }


        // 3. 判断密码是否存在
        User userResult = userService.queryUserForLogin(username, MD5Utils.getMD5Str(password));
        if (userResult != null) {
            userResult.setPassword("");

            //保存登录JsessionId，返回到一级域名
            CookieUtil.writeLoginToken(httpServletResponse,session.getId());
            //根据JsessionId保存到redis缓存中
            redis.set(session.getId(), JsonUtils.objectToJson(userResult),60*60*24);

            return ServerResponse.createBySuccess("登录成功",userResult);
        } else {
            return ServerResponse.createByErrorMessage("密码不正确, 请重试...");
        }
    }

    /**
     * @Description: 注销
     */
    @GetMapping("logout.do")
    public String logout(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        String loginToken = CookieUtil.readLoginToken(httpServletRequest);
        CookieUtil.delLoginToken(httpServletRequest,httpServletResponse);
        redis.del(loginToken);

        return "注销成功";
    }

    /**
     * @Description: 获取用户信息
     */
    @PostMapping("get_user_info.do")
    public ServerResponse<User> getUserInfo(HttpServletRequest request){
        String loginToken = CookieUtil.readLoginToken(request);
        User user = JsonUtils.jsonToPojo(redis.get(loginToken),User.class);
        if(user != null){
            return ServerResponse.createBySuccess(user);
        }
        return ServerResponse.createByErrorMessage("用户未登录,无法获取当前用户的信息");
    }
}
