package com.yash.ems.model;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Evaluation implements  Serializable {

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  evaluationId;
	
	private int overallRating;
	private String overallComment;
	@Temporal(TemporalType.DATE)
	private Date evaluationDate;
	
	/*@ManyToOne(cascade = CascadeType.MERGE)
	private Employee employee;*/
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "ev_skill_fk")
    private List<Skills> skills;
	
	


	public Evaluation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Evaluation(int evaluationId, int overallRating, String overallComment, Date evaluationDate,
			List<Skills> skills) {
		super();
		this.evaluationId = evaluationId;
		this.overallRating = overallRating;
		this.overallComment = overallComment;
		this.evaluationDate = evaluationDate;
		this.skills = skills;
	}


	public int getEvaluationId() {
		return evaluationId;
	}


	public void setEvaluationId(int evaluationId) {
		this.evaluationId = evaluationId;
	}


	public int getOverallRating() {
		return overallRating;
	}


	public void setOverallRating(int overallRating) {
		this.overallRating = overallRating;
	}


	public String getOverallComment() {
		return overallComment;
	}


	public void setOverallComment(String overallComment) {
		this.overallComment = overallComment;
	}


	public Date getEvaluationDate() {
		return evaluationDate;
	}


	public void setEvaluationDate(Date evaluationDate) {
		this.evaluationDate = evaluationDate;
	}


	public List<Skills> getSkills() {
		return skills;
	}


	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}


	@Override
	public String toString() {
		return "Evaluation [evaluationId=" + evaluationId + ", overallRating=" + overallRating + ", overallComment="
				+ overallComment + ", evaluationDate=" + evaluationDate + ", skills=" + skills + "]";
	}


	
	
}
