package com.skultech.sham.penion.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author shahab@noranj.com
 * @version 0.1.20150515
 * @change 
 * @target
 * 
 */
 

public class AnswerModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String description;

	private String imageFilePath;

	private String createdBy;

	private Date createdDate;

	private String updatedBy;

	private Date updatedDate;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
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