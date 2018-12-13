package com.example.bean;

import java.sql.Date;
import java.util.Arrays;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.validator.constraints.Email;

@Entity(name="ApplicationBean")
public class ApplicationBean {

	private int applicationId;
	
	@Size(min=3,max=25, message="name should be minimum of 3 Characters")
	@Pattern(regexp="^[a-z A-Z]*$",message="a-z and A-Zare allowed")
	private String ApplicantName;
	
	@NotNull(message="Educational Qualification Required")
	private String EducationalQualification;
	
	@Email(message="should not contain spaces in between")
	@NotNull(message="Email Id Required")
	private String emailId;
	
	@Size(min=3,max=25, message="name should be minimum of 3 Characters")
	@Pattern(regexp="^[a-z A-Z]*$",message="a-z and A-Zare allowed")
	private String fatherName;
	
	@Size(min=3,max=25, message="Religion Required")
	@Pattern(regexp="^[a-z A-Z]*$",message="a-z and A-Zare allowed")
	private String religion;
	
	@Size(min=3,max=25, message="Nationality Required")
	@Pattern(regexp="^[a-z A-Z]*$",message="a-z and A-Zare allowed")
	private String nationality;
	
	@Past(message="Date should be before today")
	private Date dateOfBirth;
	
	@Size(min=3,max=25, message="PostApplied Required")
	@Pattern(regexp="^[a-z A-Z]*$",message="a-z and A-Zare allowed")
	private String postApplied;
	
	@Size(min=3,max=25, message="Specilization Required")
	@Pattern(regexp="^[a-z A-Z.]*$",message="a-z and A-Zare allowed")
	private String specialization;
	
	@Size(min=3,max=25, message="Primary Skills Required")
	@Pattern(regexp="^[a-z A-Z]*$",message="a-z and A-Zare allowed")
	private String primarySkills;
	
	@Size(min=3,max=25, message="minimum one language Required")
	@Pattern(regexp="^[a-z A-Z,]*$",message="a-z,A-Z and , are allowed")
	private String language;
	
	@Size(min=3,max=25, message="Address Required")
	@Pattern(regexp="^[a-z A-Z,()-/]*$",message="a-z,A-Z,(,),/,- and , are allowed")
	private String presentAddress;

	@Pattern(regexp="^[a-z A-Z,()-/.]*$",message="a-z,A-Z,(,),/,- and , are allowed")
	private String permenantAddress;
	/*
	@Column(unique=true)*/
	private String userId;
	
	@ColumnDefault("None")
	private String status;
	
	@ColumnDefault("No Comments")
	private String comments;
	
	private Date modifiedDate;
	
	@Id
	@GeneratedValue
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public String getApplicantName() {
		return ApplicantName;
	}
	public void setApplicantName(String applicantName) {
		ApplicantName = applicantName;
	}
	public String getEducationalQualification() {
		return EducationalQualification;
	}
	public void setEducationalQualification(String educationalQualification) {
		EducationalQualification = educationalQualification;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	/**
	 * @return the religion
	 */
	public String getReligion() {
		return religion;
	}
	/**
	 * @param religion the religion to set
	 */
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPostApplied() {
		return postApplied;
	}
	public void setPostApplied(String postApplied) {
		this.postApplied = postApplied;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getPrimarySkills() {
		return primarySkills;
	}
	public void setPrimarySkills(String primarySkills) {
		this.primarySkills = primarySkills;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	/**
	 * @return the presentAddress
	 */
	public String getPresentAddress() {
		return presentAddress;
	}
	/**
	 * @param presentAddress the presentAddress to set
	 */
	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}
	/**
	 * @return the permenantAddress
	 */
	public String getPermenantAddress() {
		return permenantAddress;
	}
	/**
	 * @param permenantAddress the permenantAddress to set
	 */
	public void setPermenantAddress(String permenantAddress) {
		this.permenantAddress = permenantAddress;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	@Override
	public String toString() {
		return "ApplicationBean [applicationId=" + applicationId + ", ApplicantName=" + ApplicantName
				+ ", EducationalQualification=" + EducationalQualification + ", emailId=" + emailId + ", fatherName="
				+ fatherName + ", religion=" + religion + ", nationality=" + nationality + ", dateOfBirth="
				+ dateOfBirth + ", postApplied=" + postApplied + ", specialization=" + specialization
				+ ", primarySkills=" + primarySkills + ", language=" + language + ", presentAddress="
				+ presentAddress + ", permenantAddress=" + permenantAddress + ", userId=" + userId + ", status="
				+ status + ", comments=" + comments + ", modifiedDate=" + modifiedDate + "]";
	}
	
	
	
	
}
