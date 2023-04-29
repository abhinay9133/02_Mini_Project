package com.abhi.services;

import java.util.List;

import com.abhi.binding.DashboardResponse;
import com.abhi.binding.EnquiryForm;
import com.abhi.binding.EnquirySearchCriteria;
import com.abhi.entities.StudentEnqEntity;

public interface EnquiryService {
	
	List<String> getCourseNames();
	
	List<String> getEnquiryStatus();
	
	DashboardResponse getDashboardData(Integer userId);
	
	Boolean saveEnquiry(EnquiryForm form,Integer userId);
	
	List<StudentEnqEntity> getEnquiries(Integer userId,EnquirySearchCriteria search);
	
	StudentEnqEntity getStudentEnq(Integer eId);

}
