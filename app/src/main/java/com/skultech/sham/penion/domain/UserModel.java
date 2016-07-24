package com.skultech.sham.penion.domain;

import java.util.HashSet;
import java.util.Set;


public class UserModel implements  java.io.Serializable  {
	
	private Long id;
	private String username;
	private String password;
	private Boolean enabled;
	private Long retriesNum;
	private Integer state;
	private String firstName ;
	private String lastName ;
	private Long dateOfBirth ;
	
	private Set<UserRoleModel> userRole = new HashSet<UserRoleModel>(0);

	public UserModel() {
	}

	public UserModel(String username, String password, Boolean enabled) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}

	public UserModel(String username, String password, Boolean enabled, Set<UserRoleModel> userRole) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.userRole = userRole;
	}


}
