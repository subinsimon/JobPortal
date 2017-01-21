package com.jobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.entity.Job;
import com.jobportal.service.JobPortalService;

@RestController
public class JobPortalController {
	
	@Autowired
	private JobPortalService jobPortalService;
	
	@RequestMapping(value="/jobs", method=RequestMethod.POST)
	public void saveJob(@RequestBody Job job){
		jobPortalService.saveJob(job);
	}
	
	@RequestMapping(value="/jobs", method=RequestMethod.PUT)
	public void updateJob(@RequestBody Job job){
		jobPortalService.saveJob(job);
	}
	
	@RequestMapping("jobs")
	public List<Job> findAllJobs(){
		return jobPortalService.findAllJobs();
	}
	
	@RequestMapping("jobs/{user}")
	public List<Job> findByUser(@PathVariable String user){
		return jobPortalService.findByUser(user);
	}
	
	@RequestMapping(value="/jobs/{id}", method=RequestMethod.DELETE)
	public void deleteById(@PathVariable String id){
		jobPortalService.deleteById(id);
	}

}
