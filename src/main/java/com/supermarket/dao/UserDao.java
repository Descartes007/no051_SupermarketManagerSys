package com.supermarket.dao;

import java.util.List;
import java.util.Map;

import com.supermarket.entity.User;

public interface UserDao {
	
	public User findByUserName(String userName);
	
	public List<User> findAll(Map<String,Object> map);
	
	public Long count(Map<String, Object> map);
	
	public Integer add(User user);
	
	public Integer delete(Integer id);
	
	public Integer update(User user);
	
	public Integer updateReset(Integer id);
	
	public User findRoleId(String userName);
	
	
}
