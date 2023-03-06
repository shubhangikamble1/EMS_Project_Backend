package com.yash.ems.model;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Skills implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Id
	@GeneratedValue
	private int skillId;
	private String skillName;
	private String skillProficiency;
	private int skillRating;

	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Skills(int skillId, String skillName, String skillProficiency, int skillRating) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
		this.skillProficiency = skillProficiency;
		this.skillRating = skillRating;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getSkillProficiency() {
		return skillProficiency;
	}

	public void setSkillProficiency(String skillProficiency) {
		this.skillProficiency = skillProficiency;
	}

	public int getSkillRating() {
		return skillRating;
	}

	public void setSkillRating(int skillRating) {
		this.skillRating = skillRating;
	}

	@Override
	public String toString() {
		return "Skills [skillId=" + skillId + ", skillName=" + skillName + ", skillProficiency=" + skillProficiency
				+ ", skillRating=" + skillRating + "]";
	}
	
	

	
	
}
