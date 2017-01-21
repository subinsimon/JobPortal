package com.jobportal.entity;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Jobs")
public class Job {
	
	@Id
	private String id;
	private String user;
	private String location;
	private String industry;
	private String employeeType;
	private String sector;
	private String numOfPositions;
	private String[] skills;
	private String deadline;
	private String employer; 
	private String jobTitle;
	private String contact;
	private Set<JobDescription> jobdescription;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getNumOfPositions() {
		return numOfPositions;
	}
	public void setNumOfPositions(String numOfPositions) {
		this.numOfPositions = numOfPositions;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Set<JobDescription> getJobdescription() {
		return jobdescription;
	}
	public void setJobdescription(Set<JobDescription> jobdescription) {
		this.jobdescription = jobdescription;
	}

}
