package com.placement.admin.serviceImp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placement.admin.dto.JobDTO;
import com.placement.admin.dto.ServiceResponse;
import com.placement.admin.entity.JobEntityPosting;
import com.placement.admin.repository.JobRepository;
import com.placement.admin.service.JobService;
import com.placement.admin.util.Constants;

@Service
public class JobServiceImp implements JobService
{
	@Autowired
	JobRepository jobrepo;

	
	public ServiceResponse getAllJobs() 
	{
	    try {
	        // Fetch all jobs from the repository
	        List<JobEntityPosting> jobs = jobrepo.findAll();
			JSONObject result = new JSONObject();
	        // Convert List<Job> to List<Map<String, Object>> to ensure JSON structure
	        List<Map<String, Object>> jobList = new ArrayList<>();
	        for (JobEntityPosting job : jobs) {
	            Map<String, Object> jobMap = new HashMap<>();
	            jobMap.put("id", job.getId());
	            jobMap.put("jobTitle", job.getJobTitle());
	            jobMap.put("companyName", job.getCompanyName());
	            jobMap.put("salary", job.getSalary());
	            jobMap.put("companyLink", job.getCompanyLink());
	            jobMap.put("typeOfCompany", job.getTypeOfCompany());
	            jobMap.put("companyCategory", job.getCompanyCategory());
	            jobMap.put("jobDescription", job.getJobDescription());
	            jobMap.put("status", job.getStatus());

	            jobList.add(jobMap);
	        }
			result.put("aaData", jobList);
	        // Return success response with jobs as JSON array
	        return new ServiceResponse(Constants.MESSAGE_STATUS.Success, "Jobs retrieved successfully", result);
	    } catch (Exception e) {
	        // Handle any exceptions and return failure response
	        return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Error occurred while fetching jobs", null);
	    }
	}


	
	public ServiceResponse deleteJobDetails(JobDTO jobdto) {
	    try {
	        // Find the job by matching the job title and company name (or use ID if available in DTO)
	        Optional<JobEntityPosting> jobOptional = jobrepo.findByJobTitleAndCompanyName(jobdto.getJobTitle(), jobdto.getCompanyName());

	        if (jobOptional.isPresent()) {
	            jobrepo.delete(jobOptional.get()); // Delete the job
	            return new ServiceResponse(Constants.MESSAGE_STATUS.Success, "Job deleted successfully", null);
	        } else {
	            return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Job not found", null);
	        }
	    } catch (Exception e) {
	        return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Error occurred while deleting job", null);
	    }
	}


	
	public ServiceResponse verifyJobDetails(JobDTO jobdto) {
	    try {
	        // Find the job by matching the job title and company name (or use ID if available in DTO)
	        Optional<JobEntityPosting> jobOptional = jobrepo.findByJobTitleAndCompanyName(jobdto.getJobTitle(), jobdto.getCompanyName());

	        if (jobOptional.isPresent()) {
	        	JobEntityPosting job = jobOptional.get();
	            job.setStatus("VERIFIED"); // Update status
	            jobrepo.save(job); // Save the updated job
	            
	            return new ServiceResponse(Constants.MESSAGE_STATUS.Success, "Job verified successfully", null);
	        } else {
	            return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Job not found", null);
	        }
	    } catch (Exception e) {
	        return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Error occurred while verifying job", null);
	    }
	}


	
	public ServiceResponse addJobDetails(JobDTO jobdto) {
	    try {
	    	
	        // Convert JobDTO to Job entity
	    	JobEntityPosting job = new JobEntityPosting();
	        job.setJobTitle(jobdto.getJobTitle());
	        job.setCompanyName(jobdto.getCompanyName());
	        job.setSalary(jobdto.getSalary());
	        job.setCompanyLink(jobdto.getCompanyLink());
	        job.setTypeOfCompany(jobdto.getTypeOfCompany());
	        job.setCompanyCategory(jobdto.getCompanyCategory());
	        job.setJobDescription(jobdto.getJobDescription());
	        job.setStatus("Active"); // Set default status, or you can pass it from DTO if available
	        jobrepo.save(job);
	        return new ServiceResponse(Constants.MESSAGE_STATUS.Success, "Job added successfully", null);
	    } catch (Exception e) 
	    {
	        // Handle any exceptions and return failure response
	        return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Error occurred while adding the job",null);
	    }
	}


	
	public ServiceResponse getJobDetailsbyid(JobDTO jobdto) 
	{
		 try {
			 JSONObject result = new JSONObject();
		        // Find the job using job title and company name
		        Optional<JobEntityPosting> jobOptional = jobrepo.findByJobTitleAndCompanyName(jobdto.getJobTitle(), jobdto.getCompanyName());

		        if (jobOptional.isPresent()) {
		        	JobEntityPosting job = jobOptional.get();

		            // Create a JSON response with job details
		            Map<String, Object> jobMap = new HashMap<>();
		            jobMap.put("id", job.getId());
		            jobMap.put("jobTitle", job.getJobTitle());
		            jobMap.put("companyName", job.getCompanyName());
		            jobMap.put("salary", job.getSalary());
		            jobMap.put("companyLink", job.getCompanyLink());
		            jobMap.put("typeOfCompany", job.getTypeOfCompany());
		            jobMap.put("companyCategory", job.getCompanyCategory());
		            jobMap.put("jobDescription", job.getJobDescription());
		            jobMap.put("status", job.getStatus());
		            result.put("aaData", jobMap);
		            return new ServiceResponse(Constants.MESSAGE_STATUS.Success, "Job details retrieved successfully", result);
		        } else {
		            return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Job not found", null);
		        }
		    } catch (Exception e) {
		        return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Error occurred while retrieving job details", null);
		    }

	}

}
