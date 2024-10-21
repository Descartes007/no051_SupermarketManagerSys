package com.supermarket.service.impl;

import com.supermarket.dao.UserRoleDao;
import com.supermarket.entity.UserRole;
import com.supermarket.service.UserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Resource
    private UserRoleDao userRoleDao;

    public UserRole findAll(String userName) {
        return userRoleDao.findAll(userName);
    }

    public Integer add(UserRole userRole) {
        return userRoleDao.add(userRole);
    }

    public Integer delete(Integer id) {
        return userRoleDao.delete(id);
    }
}
