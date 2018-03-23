package com.pmp.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BookPriceEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2132524384841774655L;
	
	
	public Integer id;
	
	public Integer bookId;
	
	public BigDecimal price;
	
	public Integer vipLevel;
	
	public Date startTime;
	
	public Integer status;
	
	public Date endTime;
	
	public Date createTime;
	
	public Integer createId;
	
	public Date updateTime;
	
	public Date updateId;

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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getVipLevel() {
		return vipLevel;
	}

	public void setVipLevel(Integer vipLevel) {
		this.vipLevel = vipLevel;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getCreateId() {
		return createId;
	}

	public void setCreateId(Integer createId) {
		this.createId = createId;
	}

	public Date getUpdateId() {
		return updateId;
	}

	public void setUpdateId(Date updateId) {
		this.updateId = updateId;
	}
	
}
