package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Subject;
import com.example.demo.repository.SubjectRepository;

@Service
public class SubjectService {

	@Autowired
	private SubjectRepository subjectRepo;

	public List<Subject> getAllSubjects() {

		List<Subject> subjects = new ArrayList<>();

		subjectRepo.findAll().forEach(subjects::add);
		return subjects;

	}

	public void addSubject(Subject subject) {
		subjectRepo.save(subject);

	}

	public void updateSubjects(Long id, Subject subject) {
		subjectRepo.save(subject);

	}

	public void deleteSubjects(Long id) {
		subjectRepo.deleteById(id);
		
	}

}
