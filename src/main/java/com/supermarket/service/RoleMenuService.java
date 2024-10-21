package com.supermarket.service;

import java.util.List;

import com.supermarket.entity.RoleMenu;

public interface RoleMenuService {

	public List<RoleMenu> isRoleIdExistence(Integer id);

	public Integer deleteRoleId(Integer id);

	public Integer add(RoleMenu roleMenu);
}
