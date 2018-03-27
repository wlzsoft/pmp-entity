package com.pmp.entity;

import java.io.Serializable;

public class ImageResEntity implements Serializable{
	
	private static final long serialVersionUID = 5634993218863408311L;

	public Integer id ;
	
	public String md5Key;
	
	public String resourceUrl;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMd5Key() {
		return md5Key;
	}

	public void setMd5Key(String md5Key) {
		this.md5Key = md5Key;
	}

	public String getResourceUrl() {
		return resourceUrl;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}
	
	

}
