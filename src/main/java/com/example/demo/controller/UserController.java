package com.example.demo.controller;

import com.example.demo.bean.user;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Params: mybatis database connection & test redis storage
 * @Author: Siya(Xiran) Yan
 * @Date: 11:05 1/12/20
 */
@RestController
@RequestMapping("/mybatis")
public class UserController {
    @Autowired
    private UserService user;

    @RequestMapping("/getUsers")
    public List<user> getUsers() {
        List<user> users = user.getUsers();
        return users;
    }

    @GetMapping(value = "/first")
    public Map<String, Object> firstResp(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        StringBuffer requestUrl = request.getRequestURL();
        request.getSession().setAttribute("requestUrl", requestUrl);
        map.put("requestUrl", requestUrl);
        return map;
    }

    @GetMapping(value = "/sessions")
    public Object sessions(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        map.put("sessionId", request.getSession().getId());
        map.put("message", request.getSession().getAttribute("requestUrl"));
        return map;
    }
}
