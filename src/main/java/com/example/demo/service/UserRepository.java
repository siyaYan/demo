package com.example.demo.service;

import com.example.demo.bean.user;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

/**
 * @Params: interface written by mongoRepository
 * @Author: Siya(Xiran) Yan
 * @Date: 11:04 1/12/20
 */
@Service
public interface UserRepository extends MongoRepository<user, String> {
    public user save(user user);
}