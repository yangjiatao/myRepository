package com.hp.service;

import java.util.List;

import com.hp.entity.Role;
import com.hp.entity.User;


public class UserServiceImpl extends BasicService implements UserService {
	
	
	public UserServiceImpl() {
		
	}

	public void register(User user) {
		getUserDao().save(user);
	}

	
	public boolean checkLogin(String username,String password) {
		return getUserDao().checkLogin(username, password);
	}

	
	 public User selectUserByUsername(String username) {
		 return getUserDao().findUserByUsername(username);
	 }


	public List<User> findUserListAll() {
		return getUserDao().findAll();
	}

	

	public void modifyUser(User detachedInstance) {
		getUserDao().updateUser(detachedInstance);
	}

	public User findById(Integer id) {
		return getUserDao().findById(id);
	}

	public Role findRoleById(Integer id) {
		return getRoleDao().findById(id);
	}

	public void deleteUser(User user) {
		 getUserDao().delete(user);
	}

	public User findUserByUserName(String username) {
		 return getUserDao().findUserByUsername(username);
	}

	
}
