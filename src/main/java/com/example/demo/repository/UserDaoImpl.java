package com.example.demo.repository;

import com.example.demo.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Rico on 2017/6/20.
 */
@Repository
public class UserDaoImpl  implements  UserDao {

    @Autowired
    private SessionFactory _sessionFactory;

    private Session getSession() {
        return _sessionFactory.getCurrentSession();
    }

    @Override
    public void insertUser(User user) {
        this.getSession().save(user);
    }

    @Override
    public List<User> selectUsers() {
        return this.getSession().createQuery("from User").list();
    }
}
