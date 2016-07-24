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
 

public class ExamineeAnswersModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Long questionId;

	private Long correctAnswer;

	private Long selectedAnswer;

	private String createdBy;

	private Date createdDate;

	private String updatedBy;

	private Date updatedDate;

	public ExamineeAnswersModel() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public Long getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(Long correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public Long getSelectedAnswer() {
		return selectedAnswer;
	}

	public void setSelectedAnswer(Long selectedAnswer) {
		this.selectedAnswer = selectedAnswer;
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
