package com.pmp.entity;

import java.io.Serializable;
import java.util.Date;

public class UserOrgEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2169254055390619825L;

	public Integer id ;
	
	public String username ;
	
	public String password ;
	
	public String realname;
	
	public Integer status;
	
	public String phone ;
	
	public String org ;
	
	public Date lastlogTime ;
	
	public Date createTime ;
	
	public Integer createId;
	
	public Date updateTime ;
	
	public Integer updateId;
	
	public boolean isDel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public Date getLastlogTime() {
		return lastlogTime;
	}

	public void setLastlogTime(Date lastlogTime) {
		this.lastlogTime = lastlogTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getCreateId() {
		return createId;
	}

	public void setCreateId(Integer createId) {
		this.createId = createId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getUpdateId() {
		return updateId;
	}

	public void setUpdateId(Integer updateId) {
		this.updateId = updateId;
	}

	public boolean isDel() {
		return isDel;
	}

	public void setDel(boolean isDel) {
		this.isDel = isDel;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}
	
}
