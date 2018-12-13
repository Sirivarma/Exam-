package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Register;
import com.example.repository.RegisterRepository;

import com.example.exception.RecruitmentManagementException;
@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	RegisterRepository registerRepository;
	
	@Override
	public Register AddRegister(Register registerUser) throws Exception{
		Register register=registerRepository.save(registerUser);
		return register;
	}

	@Override
	public Register retiveOne(int userId) throws Exception,RecruitmentManagementException {
		Register register=registerRepository.findOne(userId);
		return register;
	}

	@Override
	public List<Register> RetriveAll() throws Exception{

		List<Register> registerList=registerRepository.findAll();
		return registerList;
	}
 
	
}
