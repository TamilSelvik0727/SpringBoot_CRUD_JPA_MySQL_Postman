package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Subject;
import com.example.demo.service.SubjectService;

@RestController
public class SubjectController {
	
	@Autowired 
	private  SubjectService subjectService;
	
	
	@GetMapping("/subjects")
	public List<Subject> getAllSubjects(){
		return subjectService.getAllSubjects();
	}
	
	//@RequestMapping(method=RequestMethod.PUT,value = "/subjects")
	@PostMapping("/addSubjects")
	public void AddSubject(@RequestBody Subject subject) {
		subjectService.addSubject(subject);
		
	}
	@PutMapping("/updateSubjects/{id}")
	public void UpdateSubjects(@PathVariable Long id,@RequestBody Subject subject) {
		subjectService.updateSubjects(id,subject);
	}
	
	@DeleteMapping("/DeleteSubjects/{id}")
	public void DeleteSubjects(@PathVariable Long id) {
		subjectService.deleteSubjects(id);
	}

}
