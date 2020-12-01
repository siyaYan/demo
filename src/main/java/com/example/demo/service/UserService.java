package com.example.demo.service;

import com.example.demo.bean.user;
import com.example.demo.mapper.one.mapperOne;
import com.example.demo.mapper.two.mapperTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Params: mybatis deploy mapper to get bean
 * @Author: Siya(Xiran) Yan
 * @Date: 11:07 1/12/20
 */
@Service
public class UserService {
    @Autowired
    private mapperOne one1;
    @Autowired
    private mapperTwo two2;
    @Autowired
    private RedisTemplate redisTemplate;

    public List<user> getUsers() {
        List<user> ones = one1.selectAll();
        List<user> twos = two2.selectAll();
        ones.addAll(twos);
        redisTemplate.opsForValue().set("users", ones);
        List<user> list = (List<user>) redisTemplate.opsForValue().get("users");
        return list;
//        return ones;
    }
}

