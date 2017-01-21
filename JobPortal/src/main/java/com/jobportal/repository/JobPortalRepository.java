package com.jobportal.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jobportal.entity.Job;

@Repository
public interface JobPortalRepository extends MongoRepository<Job, String>{
	
	public List<Job> findAll();
	
	public List<Job> findByUser(String user);

}
