package com.placement.admin.service;

import com.placement.admin.dto.JobDTO;
import com.placement.admin.dto.JobVerifyDTO;
import com.placement.admin.dto.ServiceResponse;

public interface JobService 
{
	public ServiceResponse getJobStatistics();
	public ServiceResponse getAllJobs();
	public ServiceResponse getVerifiedJob();
	public ServiceResponse deleteJobDetails(JobDTO jobdto);
	public ServiceResponse verifyJobDetails(JobVerifyDTO jobdto);
	public ServiceResponse addJobDetails(JobDTO jobdto);
	public ServiceResponse getJobDetailsbyid(JobDTO jobdto);
}
