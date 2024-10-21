package com.supermarket.service.impl;

import com.supermarket.dao.UserDao;
import com.supermarket.entity.User;
import com.supermarket.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public User findByUserName(String userName) {
        return userDao.findByUserName(userName);
    }

    public List<User> findAll(Map<String, Object> result) {
        return userDao.findAll(result);
    }

    public Long count(Map<String, Object> result) {
        return userDao.count(result);
    }

    public Integer delete(Integer id) {
        return userDao.delete(id);
    }

    public Integer update(User user) {
    	return userDao.update(user);
    }

    public Integer updateReset(Integer id) {
    	return userDao.updateReset(id);
    }

    public Integer add(User user) {return userDao.add(user); }

	public User findRoleId(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
}
