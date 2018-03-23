package com.pmp.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UserInfoLevelEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3670431461461443662L;
	
	
	public Integer id ;
	
	public Integer userInfoId;
	
	public Integer vipLevelId ;
	
	public Date startTime ;
	
	public Date endTime ;
	
	public BigDecimal price ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserInfoId() {
		return userInfoId;
	}

	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}

	public Integer getVipLevelId() {
		return vipLevelId;
	}

	public void setVipLevelId(Integer vipLevelId) {
		this.vipLevelId = vipLevelId;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
}
