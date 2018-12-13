package com.example.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.validator.constraints.Email;
import org.springframework.beans.factory.annotation.Value;
@Entity
public class Register {
	@Id
//@ColumnDefault("Candidate_Id")
private int candidateId;
	
@ColumnDefault("Admin")
@Column(name="Candidate_name")
@Size(min=2, max=50, message="minimun 3 characters Required")
@Pattern(regexp="^[a-z A-Z]*$",message="a-z and A-Z are allowed")
private String candidateName;

@ColumnDefault("12/12/1995")
@Column(name="Dateofbirth")
@Past(message="date of birth should be past")
private Date   dateOfBirth;

@ColumnDefault("Admin")
@Size(min=2, max=50, message="minimun 3 characters Required")
@Pattern(regexp="^[a-z A-Z.,]*$",message="a-z,A-Z and , are allowed")
@Column(name="Qualification")
private String qualification;

@Size(min=2, max=50, message="minimun 3 characters Required")
@Pattern(regexp="^[a-zA-Z0-9.@]*$",message="spaces not allowed")
@Email(message="should be in email format")
@ColumnDefault("Admin")
@Column(name="Email_Id")
private String emailId;

@Size(min=8, max=50, message="minimun 8 characters Required")
@Pattern(regexp="^[a-zA-Z0-9@$]*$",message="only a-z,A-Z,@,$ and 0-9 allowed")
@ColumnDefault("Admin")
@Column(name="password" )
private String password;

@Size(min=10, max=10, message="phone number should be 10 digits")
@Pattern(regexp="^[0-9]*$",message="0-9 are allowed")
@ColumnDefault("Admin")
@Column(name="contact_number")
private String contactNo;

@NotNull(message="Gender Required")
@Value(value="Admin")
@Column(name="gender")
private String gender;
/*
@Size(min=10, max=10, message="phone number should be 10 digits")
@Pattern(regexp="^[0-9]*$",message="0-9 are allowed")
@ColumnDefault("Admin")
private String contactNumber;
*/
@ColumnDefault("User")
private String userType;

@Id
@GeneratedValue
public int getCandidateId() {
	return candidateId;
}
public void setCandidateId(int candidateId) {
	this.candidateId = candidateId;
}
public String getCandidateName() {
	return candidateName;
}
public void setCandidateName(String candidateName) {
	this.candidateName = candidateName;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getContactNo() {
	return contactNo;
}
public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}/*
public String getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}*/
/**
 * @return the userType
 */
public String getUserType() {
	return userType;
}
/**
 * @param userType the userType to set
 */
public void setUserType(String userType) {
	this.userType = userType;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Register [candidateId=" + candidateId + ", candidateName=" + candidateName + ", dateOfBirth=" + dateOfBirth
			+ ", qualification=" + qualification + ", emailId=" + emailId + ", password=" + password + ", contactNo="
			+ contactNo + ", gender=" + gender + ", contactNumber=" + /*contactNumber +*/ ", userType=" + userType + "]";
}

public Register() {
	super();
	// TODO Auto-generated constructor stub
}
public Register(String candidateName, Date dateOfBirth, String qualification, String emailId,
		String password, String contactNo, String gender,  String userType) {
	super();
	/*this.candidateId = candidateId;*/
	this.candidateName = candidateName;
	this.dateOfBirth = dateOfBirth;
	this.qualification = qualification;
	this.emailId = emailId;
	this.password = password;
	this.contactNo = contactNo;
	this.gender = gender;
	/*this.contactNumber = contactNumber;*/
	this.userType = userType;
}

}
