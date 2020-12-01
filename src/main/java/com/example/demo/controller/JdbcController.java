package com.example.demo.controller;

import com.example.demo.bean.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Params: jdbcTemplate connect multiply database
 * @Author: Siya(Xiran) Yan
 * @Date: 11:07 1/12/20
 */
@RestController
@RequestMapping("/jdbc")
public class JdbcController {
    //by type
    @Autowired
    private JdbcTemplate oneTemplate;
    //by name
    @Autowired
    @Qualifier("twoTemplate")
    private JdbcTemplate twoTemplate;

    @RequestMapping("/getOne")
    public List<user> getOneUsers() {
        List<user> list = oneTemplate.query("select id,name,detail from config", new BeanPropertyRowMapper<>(user.class));
        return list;
    }

    @RequestMapping("/getTwo")
    public List<user> getTwoUsers() {
        List<user> list = twoTemplate.query("select id,name,detail from config", new BeanPropertyRowMapper<>(user.class));
        return list;
    }
}

