package com.supermarket.service.impl;

import com.supermarket.dao.RoleDao;
import com.supermarket.dao.RoleMenuDao;
import com.supermarket.entity.Role;
import com.supermarket.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleDao roleDao;

    public List<Role> findAll(Map<String, Object> result) {
        return roleDao.findAll(result);
    }

    public Long count(Map<String, Object> result) {
        return roleDao.count(result);
    }

    public Role findRepeat(String roleName) {
        return roleDao.findRepeat(roleName);
    }

    public Integer add(Role role) {
        return roleDao.add(role);
    }

    public Integer delete(Integer id) {
        return roleDao.delete(id);
    }

    public Integer update(Role role) {
        return roleDao.update(role);
    }
}
