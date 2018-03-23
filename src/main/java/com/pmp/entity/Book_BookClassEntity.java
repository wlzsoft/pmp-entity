package com.pmp.entity;

import java.io.Serializable;

public class Book_BookClassEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2533434080749490522L;
	
	public Integer id ;
	
	public Integer bookId;
	
	public Integer bookClassId;

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

	public Integer getBookClassId() {
		return bookClassId;
	}

	public void setBookClassId(Integer bookClassId) {
		this.bookClassId = bookClassId;
	}
	

}
