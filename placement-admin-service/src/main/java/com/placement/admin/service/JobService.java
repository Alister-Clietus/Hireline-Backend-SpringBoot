package com.placement.admin.service;

import com.placement.admin.dto.JobDTO;
import com.placement.admin.dto.ServiceResponse;

public interface JobService 
{
	public ServiceResponse getAllJobs();
	public ServiceResponse deleteJobDetails(JobDTO jobdto);
	public ServiceResponse verifyJobDetails(JobDTO jobdto);
	public ServiceResponse addJobDetails(JobDTO jobdto);
	public ServiceResponse getJobDetailsbyid(JobDTO jobdto);
}
