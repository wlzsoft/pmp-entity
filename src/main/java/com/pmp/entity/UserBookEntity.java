package com.pmp.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017-09-19.
 */
public class UserBookEntity implements Serializable {
	
	private static final long serialVersionUID = 4599543678350818379L;

	public Integer id;
	
	public Integer bookId;
	
	public Integer userId;
	
	public Date subTime;//订阅时间
	
	public Date lastTime;
	
	public Integer dailyGoal;//练习本 每日练习目标
	
	public Integer hidden;//是否隐藏
	
	public String remark;//备注
	
	public Integer notification ;// 是否开启提醒 0 不开启，1  开启
	
	public String notificationTime;// 提醒时间，使用 , 号分隔，每条记
	
	public Integer createId ;
	
	public Date createTime;
	
	public Integer updateId;
	
	public Date updateTime;
	
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public Integer getCreateId() {
		return createId;
	}

	public void setCreateId(Integer createId) {
		this.createId = createId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getUpdateId() {
		return updateId;
	}

	public void setUpdateId(Integer updateId) {
		this.updateId = updateId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getDailyGoal() {
		return dailyGoal;
	}

	public void setDailyGoal(Integer dailyGoal) {
		this.dailyGoal = dailyGoal;
	}

	public Integer getHidden() {
		return hidden;
	}

	public void setHidden(Integer hidden) {
		this.hidden = hidden;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getNotification() {
		return notification;
	}

	public void setNotification(Integer notification) {
		this.notification = notification;
	}

	public String getNotificationTime() {
		return notificationTime;
	}

	public void setNotificationTime(String notificationTime) {
		this.notificationTime = notificationTime;
	}

	public Date getSubTime() {
		return subTime;
	}

	public void setSubTime(Date subTime) {
		this.subTime = subTime;
	}

}
