package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: 孙宇鹏
 * @Date: 2023/10/25/16:54
 */
@Controller
public class UserController {
    @RequestMapping(value = "check_user.do")
    public String check(HttpServletRequest request, HttpServletResponse response){
        System.out.println("前后端交互");
        return "ok";
    }
}
