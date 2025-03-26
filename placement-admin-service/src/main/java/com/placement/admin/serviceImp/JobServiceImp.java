package com.placement.admin.serviceImp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placement.admin.dto.JobDTO;
import com.placement.admin.dto.JobVerifyDTO;
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

	
	 public ServiceResponse getJobStatistics() 
	 {
	        JSONObject result = new JSONObject();
	        Map<String, Object> stats = new HashMap<>();

	        try {
	            stats.put("totalJobs", jobrepo.count());
	            stats.put("verifiedJobs", jobrepo.countByStatus("VERIFIED"));
	            stats.put("highestLpaOffered", jobrepo.findHighestSalary());

	            result.put("aaData", stats);

	            return new ServiceResponse(Constants.MESSAGE_STATUS.Success, "Company details retrieved successfully", result);
	        } catch (Exception e) {
	            e.printStackTrace(); // Logging the exception for debugging
	            return new ServiceResponse(Constants.MESSAGE_STATUS.Fail, "Error fetching job statistics: " + e.getMessage(), null);
	        }
	    }
	 
	public ServiceResponse getAllJobs() 
	{
		try {
		    // Fetch all jobs from the repository
		    List<JobEntityPosting> jobs = jobrepo.findAll();
		    JSONObject result = new JSONObject();
		    // Convert List<Job> to List<Map<String, Object>> to ensure JSON structure
		    List<Map<String, Object>> jobList = new ArrayList<>();
		    for (JobEntityPosting job : jobs) {
		        if ("VERIFIED".equals(job.getStatus())) {
		            continue; // Skip jobs with status "VERIFIED"
		        }
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
		        jobMap.put("jobid", job.getEmailId());
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
	        return new ServiceResponse(Constants.MESSAGE_STATUS.fail, e.getMessage(), null);
	    }
	}
	


	
	public ServiceResponse verifyJobDetails(JobVerifyDTO jobdto) {
	    try {
	        System.out.println("In implementation");

	        // Find the job by matching email_id
	        Optional<JobEntityPosting> jobOptional = jobrepo.findByEmailId(jobdto.getJobid());

	        if (jobOptional.isPresent()) {
	            JobEntityPosting job = jobOptional.get();
	            job.setStatus("VERIFIED"); // Update status
	            jobrepo.save(job); // Save the updated job
	            System.out.println("In Saved");
	            return new ServiceResponse(Constants.MESSAGE_STATUS.Success, "Job verified successfully", null);
	        } else {
	            System.out.println("Job Not Present");
	            return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Job not found", null);
	        }
	    } catch (Exception e) {
	        return new ServiceResponse(Constants.MESSAGE_STATUS.fail, e.getMessage(), null);
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

	        // Generate a random email ID
	        String randomEmailId = UUID.randomUUID().toString().replace("-", "").substring(0, 16) + "@example.com";
	        job.setEmailId(randomEmailId);

	        job.setStatus("Active"); // Set default status, or you can pass it from DTO if available
	        jobrepo.save(job);
	        return new ServiceResponse(Constants.MESSAGE_STATUS.Success, "Job added successfully", null);
	    } catch (Exception e) {
	        // Handle any exceptions and return failure response
	        return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Error occurred while adding the job", null);
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



	public ServiceResponse getVerifiedJob() 
	{
	    try {
	        // Fetch all jobs from the repository
	        List<JobEntityPosting> jobs = jobrepo.findAll();
	        JSONObject result = new JSONObject();
	        // Convert List<Job> to List<Map<String, Object>> to ensure JSON structure
	        List<Map<String, Object>> jobList = new ArrayList<>();
	        for (JobEntityPosting job : jobs) {
	            if ("VERIFIED".equals(job.getStatus())) { // Filter only verified jobs
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
	        }
	        result.put("aaData", jobList);
	        // Return success response with jobs as JSON array
	        return new ServiceResponse(Constants.MESSAGE_STATUS.Success, "Verified jobs retrieved successfully", result);
	    } catch (Exception e) {
	        // Handle any exceptions and return failure response
	        return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Error occurred while fetching jobs", null);
	    }
	}



}
