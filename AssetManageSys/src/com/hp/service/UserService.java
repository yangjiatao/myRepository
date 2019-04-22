package com.hp.service;

import java.util.List;

import com.hp.entity.Role;
import com.hp.entity.User;


public interface UserService {
	public void register(User user);
	public boolean checkLogin(String username,String password);
	public User selectUserByUsername(String username);
	public List<User> findUserListAll();
	public Role findRoleById(Integer id);
	public void modifyUser(User user);
	public User findById(Integer id);
	public void deleteUser(User user);
	public User findUserByUserName(String username);
}
