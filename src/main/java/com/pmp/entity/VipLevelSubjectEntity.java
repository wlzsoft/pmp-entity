package com.pmp.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p><b>Title:</b><i>TODO</i></p>
 * <p>Desc: TODO</p>
 * <p>source folder:{@docRoot}</p>
 * <p>Copyright:Copyright(c)2018</p>
 * <p>Company:meizu</p>
 * <p>Create Date:2018年3月21日 上午10:30:18</p>
 * <p>Modified By:Administrator-</p>
 * <p>Modified Date:2018年3月21日 上午10:30:18</p>
 * @author <a>wanglizong</a>
 * @version Version 0.1
 *
 */
public class VipLevelSubjectEntity implements Serializable{

	private static final long serialVersionUID = -4119715964486022863L;

	public Integer id ;
	
	public String subjectName;
	
	public Integer isDel ;
	
	public Integer createId;
	
	public Date createTime;
	
	public Integer updateId;
	
	public Date updateTime;
	
	public String remark;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
