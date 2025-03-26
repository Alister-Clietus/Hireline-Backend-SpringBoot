package com.placement.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.placement.admin.dto.CompanyDTO;
import com.placement.admin.dto.JobDTO;
import com.placement.admin.dto.JobVerifyDTO;
import com.placement.admin.service.ComapnyService;
import com.placement.admin.service.JobService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("placement")
public class PlacementController 
{
	@Autowired
	JobService jobservice;
	
	@Autowired
	ComapnyService comapnyservice;
	
	@PostMapping("/add-job")
	ResponseEntity<?> addJobDetails(@Valid @RequestBody JobDTO jobdto)
	{
		return new ResponseEntity<>(jobservice.addJobDetails(jobdto),HttpStatus.OK);
	}
	
	@PostMapping("/verify-job")
	ResponseEntity<?> verifyJobDetails(@Valid @RequestBody JobVerifyDTO jobdto)
	{
		System.out.println("In Controller");
		return new ResponseEntity<>(jobservice.verifyJobDetails(jobdto),HttpStatus.OK);
	}
	
	@PostMapping("/delete-job")
	ResponseEntity<?> deleteJobDetails(@Valid @RequestBody JobDTO jobdto)
	{
		return new ResponseEntity<>(jobservice.deleteJobDetails(jobdto),HttpStatus.OK);
	}
	
	@PostMapping("/get-jobbyid")
	ResponseEntity<?> getJobDetailsbyid(@Valid @RequestBody JobDTO jobdto)
	{
		return new ResponseEntity<>(jobservice.getJobDetailsbyid(jobdto),HttpStatus.OK);
	}
	
	@GetMapping("/get-alljob")
	ResponseEntity<?> getAllJob()
	{
		return new ResponseEntity<>(jobservice.getAllJobs(),HttpStatus.OK);

	}
	@GetMapping("/get-job-statitics")
	ResponseEntity<?> getJobStatistics()
	{
		return new ResponseEntity<>(jobservice.getJobStatistics(),HttpStatus.OK);

	}
	
	@GetMapping("/get-verified-jobs")
	ResponseEntity<?> getVerifiedJob()
	{
		return new ResponseEntity<>(jobservice.getVerifiedJob(),HttpStatus.OK);

	}
	
	
	@PostMapping("/add-company")
	ResponseEntity<?> addCompanyDetails(@Valid @RequestBody CompanyDTO jobdto)
	{
		return new ResponseEntity<>(comapnyservice.addCompanyDetails(jobdto),HttpStatus.OK);
	}
	
	@PostMapping("/verify-company")
	ResponseEntity<?> verifyCompanyDetails(@Valid @RequestBody CompanyDTO jobdto)
	{
		return new ResponseEntity<>(comapnyservice.verifyCompanyDetails(jobdto),HttpStatus.OK);
	}
	
	@PostMapping("/pending-company")
	ResponseEntity<?> pendingCompanyDetails(@Valid @RequestBody CompanyDTO jobdto)
	{
		return new ResponseEntity<>(comapnyservice.pendingCompanyDetails(jobdto),HttpStatus.OK);
	}
	
	@PostMapping("/delete-company")
	ResponseEntity<?> deleteCompanyDetails(@Valid @RequestBody CompanyDTO jobdto)
	{
		return new ResponseEntity<>(comapnyservice.deleteCompanyDetails(jobdto),HttpStatus.OK);
	}
	
	@PostMapping("/get-companybyid")
	ResponseEntity<?> getCompanyDetailsbyid(@Valid @RequestBody CompanyDTO jobdto)
	{
		return new ResponseEntity<>(comapnyservice.getCompanyDetailsbyname(jobdto),HttpStatus.OK);
	}
	
	@GetMapping("/get-company")
	ResponseEntity<?> getAllCompany()
	{
		return new ResponseEntity<>(comapnyservice.getAllCompany(),HttpStatus.OK);

	}
	
	@GetMapping("/get-company-statistics")
	ResponseEntity<?> getCompanyStatistics()
	{
		return new ResponseEntity<>(comapnyservice.getCompanyStatistics(),HttpStatus.OK);

	}

}
