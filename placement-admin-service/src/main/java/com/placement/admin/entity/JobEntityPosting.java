package com.placement.admin.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "jobs")
public class JobEntityPosting {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "job_title", nullable = false)
    @NotBlank(message = "Job title is required")
    private String jobTitle;

    @Column(name = "company_name", nullable = false)
    @NotBlank(message = "Company name is required")
    private String companyName;

    @Column(name = "salary", nullable = false)
    @Min(value = 0, message = "Salary cannot be negative")
    private Double salary;

    @Column(name = "company_link", nullable = false)
    @NotBlank(message = "Company link is required")
    private String companyLink;

    @Column(name = "type_of_company", nullable = false)
    @NotBlank(message = "Type of company is required")
    private String typeOfCompany;

    @Column(name = "company_category", nullable = false)
    @NotBlank(message = "Company category (Startup or MNC) is required")
    private String companyCategory;

    @Column(name = "job_description", columnDefinition = "TEXT", nullable = false)
    @NotBlank(message = "Job description is required")
    private String jobDescription;
    
    @Column(name = "status")
    private String status;
    
    

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getCompanyLink() {
		return companyLink;
	}

	public void setCompanyLink(String companyLink) {
		this.companyLink = companyLink;
	}

	public String getTypeOfCompany() {
		return typeOfCompany;
	}

	public void setTypeOfCompany(String typeOfCompany) {
		this.typeOfCompany = typeOfCompany;
	}

	public String getCompanyCategory() {
		return companyCategory;
	}

	public void setCompanyCategory(String companyCategory) {
		this.companyCategory = companyCategory;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
    
    
    
    
    

}
