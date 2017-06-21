package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by Rico on 2017/6/20.
 * O-R
 * Hibernate - session sessionFactory
 * JPA O-R 映射的规范 entityManager
 * Spring Data JPA 再次封装JPA规范，内置多个接口|实现类，提供数据库操作
 *
 */
@Controller
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String toIndex(ModelMap modelMap) {
        List<User> userList = this.userService.getUsers();

        if(userList != null) {
            for (User user:
                 userList) {
                log.info(user.toString());
            }
        }

        modelMap.put("userList", userList);
        return "index";
    }

}
