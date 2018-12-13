package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bean.Register;

public interface RegisterRepository extends JpaRepository<Register, Integer> {

}
