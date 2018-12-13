package com.example.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.bean.ApplicationBean;

public interface ApplicationBeanRepository extends JpaRepository<ApplicationBean, Integer> {
	@Transactional
	 @Modifying
	 @Query("UPDATE ApplicationBean a SET a.status =:status, a.comments =:comment, a.modifiedDate =:date where a.applicationId =:appId")
	  int updateApplication(@Param("status") String status,@Param("comment") String comment,
	                                 @Param("appId") int appId,@Param("date") Date date);
	
} 

