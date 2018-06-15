package com.pmp.entity;

import java.io.Serializable;
import java.util.Date;

public class BookVersionEntity implements Serializable{
	
	private static final long serialVersionUID = 3865701757219238985L;

	public Integer id;
	  
	  public Integer bookId ;//'练习本Id',
	  
	  public Integer version;// '版本号',
	  
	  public Date createTime;// '创建日期',
	  
	  public Integer createId;// '创建人ID',
	  
	  public String remark;// '备注',
	  
	  public Date  updateTime;// '创建日期',
	  
	  public Integer  updateId;// '创建人ID',

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

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
	  
	  

}
