package com.abhi.binding;

import lombok.Data;

@Data
public class DashboardResponse {
	
	private int noOfEnquiries;
	private int enrolledEnquiries;
	private int lostEnquiries;

}
