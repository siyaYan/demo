package com.example.demo.service;

import com.example.demo.bean.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Params: class written by mongoRepository.save
 * @Author: Siya(Xiran) Yan
 * @Date: 11:04 1/12/20
 */
@Repository
@Service
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;

    public void save(user user) {
        userRepository.save(user);
    }
}