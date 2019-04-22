package com.hp.service;

import java.util.List;

import com.hp.entity.Role;

public class RoleServiceImpl extends BasicService implements RoleService {

	public List<Role> RoleListAll() {
		return getRoleDao().findAll();
		
	}

	public void addRole(Role role) {
		getRoleDao().save(role);
		
	}

	public void deleteRole(Role role) {
		getRoleDao().delete(role);
		
	}

	public void modifyRole(Role role) {
		getRoleDao().merge(role);
		
	}

	public Role findRoleByID(Integer id) {
		return getRoleDao().findById(id);
	}

	public Role findRoleByRoleName(String rolename) {
		return getRoleDao().findRoleByRoleName(rolename);
		 
	}

	public List<Role> findRoleListAll() {
		// TODO Auto-generated method stub
		return getRoleDao().findAll();
	}

	public int findRoleIdByUserId(Integer userId) {
		return getRoleDao().findRoleIdByUserId(userId);
	}

	public boolean findRoleIdWhereNotInUser(Integer id) {
		return getRoleDao().findRoleIdWhereNotInUser(id);
	}

	
}
