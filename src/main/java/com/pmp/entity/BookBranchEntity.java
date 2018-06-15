package com.pmp.entity;

import java.io.Serializable;
import java.util.Date;

public class BookBranchEntity implements Serializable{

	private static final long serialVersionUID = 4031129668715480206L;
	
	public Integer id ;
	
	public Integer bookId;
	
    public String bookName;//练习本名称
	
	public String language	;//	卡片使用的语言	
	
	public String area	;//	卡片所属领域
	
	public Integer  sharedType ;//共享类型 (0私有、1只读共享)
	
	public Date  createTime ;
	
	public Integer  createId ;
	
	public Date  auditorTime ;//审核时间
	
	public Integer  auditorId ;//审核人Id
	
	public String  remark   ;
	
	public Integer status;// 状态：(1:待审核  2:审核中  3:审核通过 4: 审核不通过)
	
	 public Integer version;//版本号

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



	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Date getAuditorTime() {
		return auditorTime;
	}

	public void setAuditorTime(Date auditorTime) {
		this.auditorTime = auditorTime;
	}

	public Integer getAuditorId() {
		return auditorId;
	}

	public void setAuditorId(Integer auditorId) {
		this.auditorId = auditorId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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