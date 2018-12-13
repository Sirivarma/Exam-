package com.example.service;

import java.util.List;

import com.example.bean.JobsBean;

public interface JobsBeanService {

	public JobsBean addNew(JobsBean jobsBean);
	public List<JobsBean> retriveAll();
	public JobsBean retriveOne(int id) throws Exception;
}
