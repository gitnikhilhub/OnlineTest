package com.cap.bean;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Question {
	private BigInteger questionId; 
	private ArrayList<String> questionOptions;
	private String questionTitle;
	private int questionAnswer;
	private BigDecimal questionMarks;
	private int chosenAnswer;
	private BigDecimal marksScored;
	public BigInteger getQuestionId() {
		return questionId;
	}
	public void setQuestionId(BigInteger questionId) {
		this.questionId = questionId;
	}
	public ArrayList<String> getQuestionOptions() {
		return questionOptions;
	}
	public void setQuestionOptions(ArrayList<String> questionOptions) {
		this.questionOptions = questionOptions;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public int getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(int questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	public BigDecimal getQuestionMarks() {
		return questionMarks;
	}
	public void setQuestionMarks(BigDecimal questionMarks) {
		this.questionMarks = questionMarks;
	}
	public int getChosenAnswer() {
		return chosenAnswer;
	}
	public void setChosenAnswer(int chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}
	public BigDecimal getMarksScored() {
		return marksScored;
	}
	public void setMarksScored(BigDecimal marksScored) {
		this.marksScored = marksScored;
	}
	public Question()
	{
		
	}
	public Question(BigInteger questionId, ArrayList<String> questionOptions, String questionTitle, int questionAnswer,
			BigDecimal questionMarks, int chosenAnswer, BigDecimal marksScored) {
		super();
		this.questionId = questionId;
		this.questionOptions = questionOptions;
		this.questionTitle = questionTitle;
		this.questionAnswer = questionAnswer;
		this.questionMarks = questionMarks;
		this.chosenAnswer = chosenAnswer;
		this.marksScored = marksScored;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionOptions=" + questionOptions + ", questionTitle="
				+ questionTitle + ", questionAnswer=" + questionAnswer + ", questionMarks=" + questionMarks
				+ ", chosenAnswer=" + chosenAnswer + ", marksScored=" + marksScored + "]";
	}
	
	

}
