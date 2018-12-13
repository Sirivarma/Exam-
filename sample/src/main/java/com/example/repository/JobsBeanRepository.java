package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bean.JobsBean;


public interface JobsBeanRepository extends JpaRepository< JobsBean ,Integer> {

}
