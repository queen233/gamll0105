package com.atguigu.gmall.passport.controller;

import com.atguigu.gmall.annotations.LoginRequired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PassportController {

    @RequestMapping("verify")
    @ResponseBody
    public String verify(){

        //调通过jwt校验token真假

        return "success";
    }

    @RequestMapping("index")
    @ResponseBody
    public String login(){

        //调用用户服务验证用户名和密码
        return "token";
    }

    @RequestMapping("index")
    public String index(String ReturnUrl, ModelMap modelMap){

        modelMap.put("ReturnUrl",ReturnUrl);
        return "index";
    }
}
