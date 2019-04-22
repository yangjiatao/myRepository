package com.hp.action;



import java.util.List;

import com.hp.entity.Role;
import com.hp.entity.User;


 public class UserAction extends BaseAction  {
     private static final long serialVersionUID = 572146812454l ;
     /*
      *  一个类可以实现多个接口，一个接口也可以被多个类实现。使用形象一点的比拟方法，可以把类当成一个人，接口则当做一个身份。
      *  一个人可能有多个身份（一个类可以有多个接口），他可能是军人（军人接口定义军人的属性和行为），作家（作家接口定义作家的属性和行为）等，
      *  不同的身份使得他有不同的能力和属性。一个身份（接口）也能够被多个人使用（一个接口可以被多个类实现）。比如一个军人身份可以给很多人，
      *  但是这些人完全可以用不同的能力和属性实现这个身份，他们可能是空军军官，也可能是海军列兵。身份只定义了一个人是什么，却不会告诉别人在这个身份下该这么做。
      *  怎么做是这个人本身的事情（接口仅仅定义相关的方法和属性而不实现她们）。
      */
     private List<User> userList;
     private User user ;
     private List<Role> roleListAll;
     private Role role = new Role();
     private String message;
     
     public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

	

	public String addUserPre() {
    	 roleListAll = roleService.RoleListAll();
    	 return SUCCESS;
     }
     
     public String addUser() {
    	
    	 roleListAll = roleService.RoleListAll();
    	 role = roleService.findRoleByID(role.getId());
    	 user.setRole(role);
    	 System.out.println("666666666");
    	 System.out.println(user.getUsername()+"username");
    	 //System.out.println(userService.findUserByUserName(user.getUsername()).getUsername());
    	 if(userService.findUserByUserName(user.getUsername())!=null){
    		 System.out.println("77777777");
    			message = "用户名不能相同";
    			return INPUT;
    	 }
    	 userService.register(user);
    	 return SUCCESS;
     }
     public String modifyUserPre() {
    	 roleListAll = roleService.RoleListAll();
    	 user = userService.findById(user.getId());
    	 
    	 getSession().put("user",user);
    	 return SUCCESS;
     }
     public String modifyUser() {
    	 roleListAll = roleService.RoleListAll();
    	 role = userService.findRoleById(role.getId());
    	 user.setRole(role);
    	 userService.modifyUser(user);
    	 return SUCCESS;
     }
     public String UserListAll() {


    	 userList = userService.findUserListAll();
    	 for(int i = 0;i<userList.size();i++){
  			userList.get(i).setRole(roleService.findRoleByID(userList.get(i).getRole().getId()));
  		 }
    	 getSession().put("userList", userList);
    	 return SUCCESS;

     }
     public String deleteUser() {
    	 user = userService.findById(user.getId());
    	 userService.deleteUser(user);
    	 return SUCCESS;
     }
     public String login() {
         System.out.println(user.getPassword() + "------------------------------------------");
    	 if(userService.checkLogin(user.getUsername(), user.getPassword())){
    		 user = userService.findUserByUserName(user.getUsername());
    		 int roleId = roleService.findRoleIdByUserId(user.getId());
    		 getSession().put("roleId", roleId);
    	 return SUCCESS;
    	 }
    	 message = "账号或密码错误，请重新登录！";
    	 return INPUT;
     }
     
     public String logout() {
    	 this.getHttpSession().removeAttribute("user");
    	 return SUCCESS;
     }

	
	public List<Role> getRoleListAll() {
		return roleListAll;
	}

	public void setRoleListAll(List<Role> roleListAll) {
		this.roleListAll = roleListAll;
	}
	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
} 