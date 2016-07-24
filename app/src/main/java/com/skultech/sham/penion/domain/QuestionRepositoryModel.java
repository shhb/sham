package com.skultech.sham.penion.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author shahab@noranj.com
 * @version 0.1.20150515
 * @change 0.1.20150602
 * @target
 * 
 */
 

public class QuestionRepositoryModel  implements Serializable{

	private static final long serialVersionUID = 1L;  
	 
	private Long id;

	private String title;

	private AnswerModel answer1;

	private AnswerModel answer2;

	private AnswerModel answer3;

	private AnswerModel answer4;

	private AnswerModel answer5;

	private AnswerModel answer6;

	private Long correctAnswer;

	private Integer severity;

	private Integer visibility;

	private String comment;

	private String createdBy;

	private Date createdDate;

	private String updatedBy;

	private Date updatedDate;

	private SubjectModel subject;

	private Integer type;

	private String questionImageFileLocation;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public AnswerModel getAnswer1() {
		return answer1;
	}

	public void setAnswer1(AnswerModel answer1) {
		this.answer1 = answer1;
	}

	public AnswerModel getAnswer2() {
		return answer2;
	}

	public void setAnswer2(AnswerModel answer2) {
		this.answer2 = answer2;
	}

	public AnswerModel getAnswer3() {
		return answer3;
	}

	public void setAnswer3(AnswerModel answer3) {
		this.answer3 = answer3;
	}

	public AnswerModel getAnswer4() {
		return answer4;
	}

	public void setAnswer4(AnswerModel answer4) {
		this.answer4 = answer4;
	}

	public AnswerModel getAnswer5() {
		return answer5;
	}

	public void setAnswer5(AnswerModel answer5) {
		this.answer5 = answer5;
	}

	public AnswerModel getAnswer6() {
		return answer6;
	}

	public void setAnswer6(AnswerModel answer6) {
		this.answer6 = answer6;
	}

	public Long getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(Long correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public Integer getSeverity() {
		return severity;
	}

	public void setSeverity(Integer severity) {
		this.severity = severity;
	}

	public Integer getVisibility() {
		return visibility;
	}

	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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

	public SubjectModel getSubject() {
		return subject;
	}

	public void setSubject(SubjectModel subject) {
		this.subject = subject;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getQuestionImageFileLocation() {
		return questionImageFileLocation;
	}

	public void setQuestionImageFileLocation(String questionImageFileLocation) {
		this.questionImageFileLocation = questionImageFileLocation;
	}
}
