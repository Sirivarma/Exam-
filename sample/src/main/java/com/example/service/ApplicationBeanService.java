package com.example.service;

import java.sql.Date;
import java.util.List;

import com.example.bean.ApplicationBean;

public interface ApplicationBeanService {
	public ApplicationBean addApplication(ApplicationBean app);
	public List<ApplicationBean> retriveAll();
	public ApplicationBean retriveOne(int id) throws Exception;
	public int updateApplication(String status,String comments,int appId,Date date);

}
