package com.skultech.sham.penion.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author shahab@noranj.com
 * @version 0.1.20160713
 * @change 
 * @target
 * 
 */
 

public class SubjectModel  implements Serializable{

	private static final long serialVersionUID = 1L;  
	 
	private Long id;

	private String name;

	private String createdBy;

	private Date createdDate;

	private String updatedBy;

	private Date updatedDate;

	public SubjectModel() {
		super();
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
}
