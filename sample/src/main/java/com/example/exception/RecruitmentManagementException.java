package com.example.exception;


public class RecruitmentManagementException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int code;
	private String status;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public RecruitmentManagementException(String status) {
		super(status);
		// TODO Auto-generated constructor stub
	}
	public RecruitmentManagementException(int code, String status) {
		super();
		this.code = code;
		this.status = status;
	}
	public RecruitmentManagementException() {
		
	}

}
