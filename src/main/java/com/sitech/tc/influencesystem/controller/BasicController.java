package com.sitech.tc.influencesystem.controller;

import com.sitech.tc.influencesystem.common.CookieUtil;
import com.sitech.tc.influencesystem.common.RedisOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
        String redisValue = isLogin(request);
        if(redisValue == null){
            return  "redirect:/index";
        }
        return "form_basic";
    }

    @GetMapping("/newform")
    public String newform(HttpServletRequest request){
        //检查是否登录
        String redisValue = isLogin(request);
        if(redisValue == null){
            return  "redirect:/index";
        }
        return "newform1";
    }


    /**
     * @Description: 判断是否登录
     */
    public String isLogin(HttpServletRequest request){
        String loginToken = CookieUtil.readLoginToken(request);
        String redisValue = null;
        if(loginToken != null){
            redisValue = redis.get(loginToken);
        }

        return redisValue;
    }
}
