package com.example.demo.controller;

import com.example.demo.bean.user;
import com.example.demo.service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Params: debug logger print & mongodb save test
 * @Author: Siya(Xiran) Yan
 * @Date: 10:58 1/12/20
 */

/** important without it, web will have no reaction*/
@RestController
@RequestMapping("/")
public class HelloController {
    protected static Logger logger = LoggerFactory.getLogger(HelloController.class);

    /** use Impl written by MongoRepository **/
    @Autowired
    private UserServiceImpl impl;
    /** use mongodbTemplate **/
    @Autowired
    MongoTemplate mongoTemplate;

    @RequestMapping("save")
    public boolean save() {
        // 插入数据
        user user = new user();
        user.setId("003");
        user.setName("test");
        user.setDetail("122212");
        /** two methods for this, one is use template **/
        //impl.save(user);
        mongoTemplate.save(user);
        return true;
    }

    @RequestMapping("hello")
    public String helloworld() {
        logger.debug("hello debug!");
        logger.info("info 级别的日志");
        return "Hello world!";
    }

    @RequestMapping("/hello/{name}")
    public String helloName(@PathVariable String name) {
        logger.debug("debug: hello,Name={}", name);
        return "Hello " + name;
    }
}
