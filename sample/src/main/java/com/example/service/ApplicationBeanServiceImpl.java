package com.example.service;

import java.util.List;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.ApplicationBean;
import com.example.repository.ApplicationBeanRepository;

@Service
public class ApplicationBeanServiceImpl implements ApplicationBeanService{

	@Autowired
	ApplicationBeanRepository applicationrepository;
	
	@Override
	public ApplicationBean addApplication(ApplicationBean app) {
		ApplicationBean applicationbean=applicationrepository.save(app);
		return applicationbean;
	}
	public List<ApplicationBean> retriveAll(){
		List<ApplicationBean> aList=applicationrepository.findAll();
		return aList;
	}
	@Override
	public int updateApplication(String status, String comments, int appId,Date date) {
		
		return applicationrepository.updateApplication(status, comments, appId,date);
	}
	@Override
	public ApplicationBean retriveOne(int id) throws Exception {
		 return applicationrepository.findOne(id);
	}


}