package com.pmp.entity;

import java.io.Serializable;
import java.util.Date;

public class BookClassEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4470429028296586742L;
	
	public Integer id ;
	
	public String bookClassKey;
	
	public String bookClassValue;
	
	public String imageUrl ;
	
	public Integer sorl;
	
	public Integer isView;
	
	public Date createTime;
	
	public Integer createId;
	
	public Date updateTime ;
	
	public Integer updateId;
	
	public Boolean isDel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getBookClassKey() {
		return bookClassKey;
	}

	public void setBookClassKey(String bookClassKey) {
		this.bookClassKey = bookClassKey;
	}

	public String getBookClassValue() {
		return bookClassValue;
	}

	public void setBookClassValue(String bookClassValue) {
		this.bookClassValue = bookClassValue;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Integer getSorl() {
		return sorl;
	}

	public void setSorl(Integer sorl) {
		this.sorl = sorl;
	}

	public Integer getIsView() {
		return isView;
	}

	public void setIsView(Integer isView) {
		this.isView = isView;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getCreateId() {
		return createId;
	}

	public void setCreateId(Integer createId) {
		this.createId = createId;
	}

	public Integer getUpdateId() {
		return updateId;
	}

	public void setUpdateId(Integer updateId) {
		this.updateId = updateId;
	}

	public Boolean getIsDel() {
		return isDel;
	}

	public void setIsDel(Boolean isDel) {
		this.isDel = isDel;
	}

}
