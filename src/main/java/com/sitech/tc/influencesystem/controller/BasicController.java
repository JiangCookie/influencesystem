package com.sitech.tc.influencesystem.controller;

import com.sitech.tc.influencesystem.common.CookieUtil;
import com.sitech.tc.influencesystem.common.JsonUtils;
import com.sitech.tc.influencesystem.common.RedisOperator;
import com.sitech.tc.influencesystem.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author JYH
 * 2019/3/1 10:13
 */
@Controller
public class BasicController {

    @Autowired
    public RedisOperator redis;

    @GetMapping("/index")
    public String index(){
        return "index1";
    }


    @GetMapping("/form_basic")
    public String form_basic(HttpServletRequest request){
        //检查是否登录
        User user = isLogin(request);
        if(user == null){
            return  "redirect:/index";
        }
        return "form_basic";
    }

    @GetMapping("/newform1")
    public String newform(HttpServletRequest request){
        //检查是否登录
        User user = isLogin(request);
        if(user == null){
            return  "redirect:/index";
        }

        if(user.getRole() == 2){
            return  "redirect:/newform2";
        }
        return "newform1";
    }


    @GetMapping("/newform2")
    public String newform1(HttpServletRequest request){
        //检查是否登录
        User user = isLogin(request);
        if(user == null){
            return  "redirect:/index";
        }
        if(user.getRole() == 1){
            return  "redirect:/newform1";
        }
        return "newform2";
    }

    /**
     * @Description: 判断是否登录
     */
    public User isLogin(HttpServletRequest request){
        String loginToken = CookieUtil.readLoginToken(request);
        String redisValue = null;
        if(loginToken != null){
            redisValue = redis.get(loginToken);
        }
        User uesr = JsonUtils.jsonToPojo(redisValue, User.class);
        return uesr;
    }
}
