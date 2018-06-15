package com.pmp.entity;

import java.io.Serializable;
import java.util.Date;

public class BookEntity implements Serializable{

	private static final long serialVersionUID = 4031129668715480206L;
	
	public Integer id ;
	
    public String bookName;//练习本名称
	
	public String language;//	卡片使用的语言	
	
	public String area	;//	卡片所属领域
	
	public Integer  sharedType ;//共享类型 (0私有、1只读共享)
	
	public Date  createTime ;
	
	public Integer  createId ;
	
	public Date  updateTime ;
	
	public Integer  updateId ;
	
	public Date  updateDetailTime ;
	
	public Integer  updateDetailId ;
	
	public String  remark   ;
	
	public Integer version ;//线上当前版本号

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getSharedType() {
		return sharedType;
	}

	public void setSharedType(Integer sharedType) {
		this.sharedType = sharedType;
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

	public Date getUpdateDetailTime() {
		return updateDetailTime;
	}

	public void setUpdateDetailTime(Date updateDetailTime) {
		this.updateDetailTime = updateDetailTime;
	}

	public Integer getUpdateDetailId() {
		return updateDetailId;
	}

	public void setUpdateDetailId(Integer updateDetailId) {
		this.updateDetailId = updateDetailId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
}