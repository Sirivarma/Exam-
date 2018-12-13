package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.JobsBean;
import com.example.repository.JobsBeanRepository;
@Service
public class JobsBeanServiceImpl implements JobsBeanService {
	@Autowired
	JobsBeanRepository jobsBeanRepository;
	@Override
	public JobsBean addNew(JobsBean jobsBean) {
		JobsBean job=jobsBeanRepository.save(jobsBean);
		return job;
	}

	@Override
	public List<JobsBean> retriveAll() {
		List<JobsBean> jobList=jobsBeanRepository.findAll();
		return jobList;
	}

	@Override
	public JobsBean retriveOne(int id) throws Exception {
		JobsBean job=jobsBeanRepository.findOne(id);
		return job;
	}

}
