package com.example.service;

import java.util.List;

import com.example.bean.Register;

public interface RegisterService {
	public Register AddRegister(Register registerUser) throws Exception;
	public Register retiveOne(int userId)throws Exception;
	public List<Register> RetriveAll()throws Exception;
}
