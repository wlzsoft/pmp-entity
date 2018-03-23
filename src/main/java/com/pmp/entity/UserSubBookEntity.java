package com.pmp.entity;

import java.io.Serializable;
import java.util.Date;

public class UserSubBookEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2764013642956024508L;
	
	
	public Integer id ;
	
	public Integer userInfoId;
	
	public Integer bookId;
	
	public Date subTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Date getSubTime() {
		return subTime;
	}

	public void setSubTime(Date subTime) {
		this.subTime = subTime;
	}

	public Integer getUserInfoId() {
		return userInfoId;
	}

	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}
	

}
