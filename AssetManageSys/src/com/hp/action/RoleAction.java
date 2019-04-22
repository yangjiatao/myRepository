package com.hp.action;

import java.util.ArrayList;
import java.util.List;

import com.hp.entity.Role;

public class RoleAction  extends BaseAction {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Role role;
	private List<Role> roleListAll;
	 private String message;
	 private String method;
	 
	     public List<Role> getRoleListAll() {
		return roleListAll;
	}

	public void setRoleListAll(List<Role> roleListAll) {
		this.roleListAll = roleListAll;
	}

		public String addRolePre() {
	    	 return SUCCESS;
	     }
	   
	     public String addRole() {
//	    	 if(roleService.findRoleByRoleName(role.getRolename())!=null){
//	    		 	message = "角色名不能相同";
//	    			return INPUT;
//	    	 }
	    	 System.out.println("role++++++++++++++");
	    	 roleService.addRole(role);
	    	 return SUCCESS;
	     }
	     public String modifyRolePre() {
	    	 role = roleService.findRoleByID(role.getId());
	    	 return SUCCESS;
	     }
	     public String modifyRole() {
	    	 roleService.modifyRole(role);
	    	 return SUCCESS;
	     }
	     public String RoleListAll() {
	    	 roleListAll = roleService.findRoleListAll();
	    	 //message = "";
	    	 if(null != method) {
	    		 message = "";
	    		 getSession().put("message", message);
	    		 return ERROR;
	    	 }
	    	 getSession().put("roleListAll", roleListAll);
	    	 
	    	 return SUCCESS;
	     }
	   
	     public String deleteRole() {
	    	 
	    	 role = roleService.findRoleByID(role.getId());
	    	 if(!roleService.findRoleIdWhereNotInUser(role.getId())) {
	    		 roleService.deleteRole(role);
	    		 System.out.println("successfulsuccessfulsuccessfulsuccessful");
	    		 message = "删除成功";
	    		 getSession().put("message", message);
		    	 return SUCCESS;
	    	 }else{
	    		 message = "该角色被占用，不能删除！";
	    		 System.out.println("errorerrorerrorerrorerrorerrorerrorerror");
	    		 getSession().put("message", message);
	    		 return INPUT;
	    	 }
	    	 //getSession().put("message", message);
	    	 //return SUCCESS;
	     }

		public Role getRole() {
			return role;
		}

		public void setRole(Role role) {
			this.role = role;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getMethod() {
			return method;
		}

		public void setMethod(String method) {
			this.method = method;
		}
	     
	     
}
