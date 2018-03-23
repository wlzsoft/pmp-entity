package com.pmp.entity;

import java.io.Serializable;

public class userOrgRoleEntity implements Serializable{

	private static final long serialVersionUID = 4597700236949424373L;

	public Integer id ;
	
	public Integer userOrgId;
	
	public Integer roleId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserOrgId() {
		return userOrgId;
	}

	public void setUserOrgId(Integer userOrgId) {
		this.userOrgId = userOrgId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	

}
