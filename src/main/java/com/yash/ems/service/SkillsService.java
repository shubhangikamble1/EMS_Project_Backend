package com.yash.ems.service;

import java.util.List;

import com.yash.ems.model.Skills;


public interface SkillsService {

	public Skills addSkills(Skills skills);
	public List<Skills> getAllSkill();
	void deleteEmployee(Integer skillId);
	public Skills updateSkills(Skills skill,Integer skillId);;

}
