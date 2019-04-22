package com.hp.service;

import java.util.List;

import com.hp.entity.Role;

public interface RoleService {

	public void addRole(Role role);

	public void modifyRole(Role role);

	public List<Role> RoleListAll();

	public void deleteRole(Role role);
	public Role findRoleByID(Integer id);

	public Role findRoleByRoleName(String rolename);

	public List<Role> findRoleListAll();

	public int findRoleIdByUserId(Integer id);

	public boolean findRoleIdWhereNotInUser(Integer id);

}
