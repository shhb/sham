package com.skultech.sham.penion.domain;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author shahab@noranj.com
 * @version 0.1.20150515
 * @change 
 * @target
 * 
 */
 

public class ExamModel  implements Serializable{

	private static final long serialVersionUID = 1L;  
	 
	private Long id;
	
	private String title ;
	
	private Integer numOfQuestions; 
	
	private Integer durationInMinute ;
	
	private Integer type ;
	
	private Integer severity ;  
	
	private Boolean sendNotificationParents ; 
	
	private Integer visibility;
	
	private Boolean canSkipQuestion;
	
	private Boolean hasNegativeMarking;
	
	private String createdBy;
	
	private Date createdDate;
	
	private String updatedBy;
	
	private Date updatedDate;
	
	private SubjectModel subject;
	
	private List<QuestionRepositoryModel> questions;
		
	public ExamModel() {
		super();
	}


}
