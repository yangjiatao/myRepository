package com.hp.entity;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer id;
	private Role role;
	private String username;
	private String password;
	private Integer age;
	private String email;
	private String phone;
	private String rolename;
	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(Role role, String username) {
		this.role = role;
		this.username = username;
	}

	/** full constructor */
	public User(Role role, String username, String password, Integer age,
			String email, String phone) {
		this.role = role;
		this.username = username;
		this.password = password;
		this.age = age;
		this.email = email;
		this.phone = phone;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}