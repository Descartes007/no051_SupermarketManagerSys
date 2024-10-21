package com.supermarket.service.impl;

import com.supermarket.dao.RoleMenuDao;
import com.supermarket.entity.RoleMenu;
import com.supermarket.service.RoleMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class RoleMenuServiceImpl implements RoleMenuService {

    @Resource
    private RoleMenuDao roleMenuDao;

    public List<RoleMenu> isRoleIdExistence(Integer roleId) {
        return roleMenuDao.isRoleIdExistence(roleId);
    }

    public Integer deleteRoleId(Integer roleId) {return roleMenuDao.deleteRoleId(roleId); }

    public Integer add(RoleMenu roleMenu) {return roleMenuDao.add(roleMenu); }
}
