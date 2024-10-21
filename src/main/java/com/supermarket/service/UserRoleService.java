package com.supermarket.service;


import com.supermarket.entity.UserRole;

public interface UserRoleService {
	
	public Integer add(UserRole userRole);
	
	public UserRole findAll(String userName);
	
	public Integer delete(Integer id);
}
