package com.yash.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.yash.ems.model.Skills;

import com.yash.ems.serviceimpl.SkillsServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/ems/skills")
public class SkillsController {
	
	@Autowired
	private SkillsServiceImpl skillsService;
	@PostMapping("/save-skills")
	public Skills addSkills(@RequestBody Skills skills)
	{
		return skillsService.addSkills(skills);
	}
	@GetMapping("/get-all-employees-skills")
	public List<Skills> getAllSkillsDetails()
	{
		return skillsService.getAllSkill();
	}
}
