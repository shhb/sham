package com.skultech.sham.penion.domain;

public class UserRoleModel implements  java.io.Serializable{

	private Integer userRoleId;
	private UserModel user;
	private String role;

	public UserRoleModel() {
	}

	public UserRoleModel(UserModel user, String role) {
		this.user = user;
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}
}