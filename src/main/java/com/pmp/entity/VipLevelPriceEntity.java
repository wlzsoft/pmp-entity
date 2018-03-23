package com.pmp.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class VipLevelPriceEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 343255117651764060L;
	
	public Integer id ;
	
	public Integer vipLevelId ;
	
	public Integer subjectId;
	
	public BigDecimal price;
	
	public Integer priceStatus ;
	
	public Date createTime ;
	
	public Integer createId;
	
	public Date updateTime;
	
	public Date updateId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVipLevelId() {
		return vipLevelId;
	}

	public void setVipLevelId(Integer vipLevelId) {
		this.vipLevelId = vipLevelId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getPriceStatus() {
		return priceStatus;
	}

	public void setPriceStatus(Integer priceStatus) {
		this.priceStatus = priceStatus;
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

	public Date getUpdateId() {
		return updateId;
	}

	public void setUpdateId(Date updateId) {
		this.updateId = updateId;
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	
}
