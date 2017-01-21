package com.jobportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.entity.Job;
import com.jobportal.repository.JobPortalRepository;

@Service
public class JobPortalService {
	
	@Autowired
	private JobPortalRepository jobPortalRepository;
	
	public void saveJob(Job job){
		jobPortalRepository.save(job);
	}

	public List<Job> findAllJobs() {
		return jobPortalRepository.findAll();
		
	}

	public List<Job> findByUser(String user) {
		return jobPortalRepository.findByUser(user);
	}

	public void deleteById(String id) {
		jobPortalRepository.delete(id);	
	}
}
