package com.pmp.entity;

import java.io.Serializable;
import java.util.Date;

public class CardBranchEntity implements Serializable{

	private static final long serialVersionUID = 461079389536773396L;
	
	public Integer id	;	
	 
	public Integer bookId ;//练习本主键ID
	 
	public Integer pointId	;//知识点ID
	 
	public Integer cardId;//卡片ID
	
    public String  cardData  ;//卡片数据
	public Date createTime	;//创建时间				
	public Integer createId	;//创建人ID				
	public Date updateTime	;//修改时间				
	public Integer updateId	;//修改人ID
    public Integer version;//版本号
    
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public Integer getCardId() {
		return cardId;
	}
	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPointId() {
		return pointId;
	}
	public void setPointId(Integer pointId) {
		this.pointId = pointId;
	}
	public String getCardData() {
		return cardData;
	}
	public void setCardData(String cardData) {
		this.cardData = cardData;
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
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}

}