package com.example.bean;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

@Entity
public class JobsBean {

	private int jobId;
	
	@Size(min=2, max=50, message="minimun 3 characters Required")
	@Pattern(regexp="^[a-z A-Z]*$",message="a-z and A-Zare allowed")
	private String JobTitle;
	
	@Size(min=2, max=50, message="Qualification Required")
	@Pattern(regexp="^[a-z A-Z,.]*$",message="a-z,A-Z and , are allowed")
	private String qualification;
	
	@Future(message="date Should be before today")
	private Date startDate;
	
	@Future(message="date Should be before today")
	private Date lastDate;
	
	@Size(min=2, max=2, message="sholud be 10+ and below")
	@Pattern(regexp="^[0-9]*$",message="0-9 allowed")
	private String AgeLimit;
	
	@Size(min=2, max=50, message="minimun 3 characters Required")
	@Pattern(regexp="^[a-z A-Z,]*$",message="a-z,A-Z and , are allowed")
	private String jobLocation;
	
	@Size(min=2, max=50, message="minimun 3 characters Required")
	@Pattern(regexp="^[a-z A-Z,]*$",message="a-z,A-Z and , are allowed")
	private String organizationName;
	
	@Size(min=2, max=50, message="minimun 3 characters Required")
	@Pattern(regexp="^[a-z A-Z,.()]*$",message="a-z,A-Z,(,) and , are allowed")
	private String jobDescription;
	
	@Size(min=2, max=50, message="minimun 3 characters Required")
	@Pattern(regexp="^[0-9-]*$",message="0-9and - are allowed")
	private String experience;
	@NotNull(message="cannot be empty")
	@Range(min = (long) 10.0, message="salary should be high")
	private double jobSalary;
	
	@NotNull(message="cannot be empty")
	private Integer numberOfVaccency;
	
	/**
	 * @return the jobSalary
	 */
	public double getJobSalary() {
		return jobSalary;
	}
	/**
	 * @param jobSalary the jobSalary to set
	 */
	public void setJobSalary(double jobSalary) {
		this.jobSalary = jobSalary;
	}
	
	/**
	 * @return the jobId
	 */
	@Id
	@GeneratedValue
	public int getJobId() {
		return jobId;
	}
	/**
	 * @param jobId the jobId to set
	 */
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return JobTitle;
	}
	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}
	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the lastDate
	 */
	public Date getLastDate() {
		return lastDate;
	}
	/**
	 * @param lastDate the lastDate to set
	 */
	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}
	/**
	 * @return the ageLimit
	 */
	public String getAgeLimit() {
		return AgeLimit;
	}
	/**
	 * @param ageLimit the ageLimit to set
	 */
	public void setAgeLimit(String ageLimit) {
		AgeLimit = ageLimit;
	}
	/**
	 * @return the jobLocation
	 */
	public String getJobLocation() {
		return jobLocation;
	}
	/**
	 * @param jobLocation the jobLocation to set
	 */
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	/**
	 * @return the organizationName
	 */
	public String getOrganizationName() {
		return organizationName;
	}
	/**
	 * @param organizationName the organizationName to set
	 */
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	/**
	 * @return the jobDescription
	 */
	public String getJobDescription() {
		return jobDescription;
	}
	/**
	 * @param jobDescription the jobDescription to set
	 */
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	/**
	 * @return the experience
	 */
	public String getExperience() {
		return experience;
	}
	/**
	 * @param experience the experience to set
	 */
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	public Integer getNumberOfVaccency() {
		return numberOfVaccency;
	}
	public void setNumberOfVaccency(Integer numberOfVaccency) {
		this.numberOfVaccency = numberOfVaccency;
	}
	@Override
	public String toString() {
		return "JobsBean [jobId=" + jobId + ", JobTitle=" + JobTitle + ", qualification=" + qualification
				+ ", startDate=" + startDate + ", lastDate=" + lastDate + ", AgeLimit=" + AgeLimit + ", jobLocation="
				+ jobLocation + ", organizationName=" + organizationName + ", jobDescription=" + jobDescription
				+ ", experience=" + experience + ", jobSalary=" + jobSalary + ", numberOfVaccency=" + numberOfVaccency
				+ "]";
	}
	
}
