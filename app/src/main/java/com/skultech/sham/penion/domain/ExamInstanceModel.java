package com.skultech.sham.penion.domain;

/**
 * Created by tedev on 2016-07-14.
 */

import java.util.List;

public class ExamInstanceModel{

        private Integer id;

        private Integer examineeId;

        private String startDate;

        private String endDate;

        private Integer numCorrectAnswers;

        private Integer numWrongAnswers;

        private String createdBy;

        private String createdDate;

        private String updatedBy;

        private String updatedDate;

        private String assignedDate;

        private ExamModel exam;

        private String state;

        private List<ExamineeAnswersModel> examineeAnswers;


        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getExamineeId() {
            return examineeId;
        }

        public void setExamineeId(Integer examineeId) {
            this.examineeId = examineeId;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public Integer getNumCorrectAnswers() {
            return numCorrectAnswers;
        }

        public void setNumCorrectAnswers(Integer numCorrectAnswers) {
            this.numCorrectAnswers = numCorrectAnswers;
        }

        public Integer getNumWrongAnswers() {
            return numWrongAnswers;
        }

        public void setNumWrongAnswers(Integer numWrongAnswers) {
            this.numWrongAnswers = numWrongAnswers;
        }

        public String getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
        }

        public String getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
        }

        public String getUpdatedBy() {
            return updatedBy;
        }

        public void setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
        }

        public String getUpdatedDate() {
            return updatedDate;
        }

        public void setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
        }

        public String getAssignedDate() {
            return assignedDate;
        }

        public void setAssignedDate(String assignedDate) {
            this.assignedDate = assignedDate;
        }

        public ExamModel getExam() {
            return exam;
        }

        public void setExam(ExamModel exam) {
            this.exam = exam;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public List<ExamineeAnswersModel> getExamineeAnswers() {
            return examineeAnswers;
        }

        public void setExamineeAnswers(List<ExamineeAnswersModel> examineeAnswers) {
            this.examineeAnswers = examineeAnswers;
        }
}
