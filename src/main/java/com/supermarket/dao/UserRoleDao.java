package com.supermarket.dao;


import com.supermarket.entity.UserRole;

public interface UserRoleDao {
	
	public Integer add(UserRole userRole);
	
	public UserRole findAll(String userName);
	
	public Integer delete(Integer id);
}
