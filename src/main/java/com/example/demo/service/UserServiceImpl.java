package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Rico on 2017/6/20.
 */
@Service
@Transactional
public class UserServiceImpl implements  UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<User> getUsers() {
        return this.userDao.selectUsers();
    }
}
