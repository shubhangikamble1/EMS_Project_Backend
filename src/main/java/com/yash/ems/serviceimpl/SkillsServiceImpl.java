package com.yash.ems.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.ems.model.Skills;
import com.yash.ems.repo.SkillsRepository;
import com.yash.ems.service.SkillsService;

@Service
public class SkillsServiceImpl  implements SkillsService{

	@Autowired
	private SkillsRepository skRepository;
	
	@Override
	public Skills addSkills(Skills skills) {
		
		return skRepository.save(skills);
	}

	@Override
	public List<Skills> getAllSkill() {
		
		return skRepository.findAll();
	}

	@Override
	public void deleteEmployee(Integer skillId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Skills updateSkills(Skills skill, Integer skillId) {
		// TODO Auto-generated method stub
		return null;
	}

}
