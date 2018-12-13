package com.example.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User {
	@Id

	@Size(min=1, max=50, message="userName Required")
	@Pattern(regexp="^[0-9]*$",message="0-9 are allowed")
	private String username;
	
	@Size(min=8, max=50, message="minimun 8 characters Required")
	@Pattern(regexp="^[a-zA-Z@$0-9]*$",message="only a-z,A-z and 0-9 are allowed spaces not allowed")
	private String password;
	
	@Column(name="user_type")
	private String userType;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", userType=" + userType + "]";
	}

}
