package com.example.demo.repository;

import com.example.demo.domain.User;

import java.util.List;

/**
 * Created by Rico on 2017/6/20.
 */
public interface UserDao {

    public void insertUser(User user);

    public List<User> selectUsers();
}
