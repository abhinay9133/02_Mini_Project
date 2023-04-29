package com.abhi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.abhi.entities.StudentEnqEntity;
import com.abhi.entities.UserDtlsEntity;

public interface StudentEnquiriesRepository extends JpaRepository<StudentEnqEntity, Integer> {
   
}
