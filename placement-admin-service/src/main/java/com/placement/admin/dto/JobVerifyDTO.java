package com.placement.admin.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class JobVerifyDTO 
{
	@NotBlank(message = "Job Title is required.")
    private String jobid;
	
	@NotBlank(message = "Job Title is required.")
    @Size(max = 100, message = "Job Title must be at most 100 characters.")
    private String jobTitle;

    @NotBlank(message = "Company Name is required.")
    @Size(max = 100, message = "Company Name must be at most 100 characters.")
    private String companyName;

    @NotNull(message = "Salary is required.")
    @Min(value = 10000, message = "Salary must be at least 10,000.")
    @Max(value = 10000000, message = "Salary must be at most 10,000,000.")
    private Double salary;

    @NotBlank(message = "Company Link is required.")
    @Pattern(
        regexp = "^(https?|ftp)://[\\w.-]+(?:\\.[\\w\\.-]+)+[/#?]?.*$",
        message = "Invalid URL format for Company Link."
    )
    private String companyLink;

    @NotBlank(message = "Type of Company is required.")
    @Size(max = 50, message = "Type of Company must be at most 50 characters.")
    private String typeOfCompany;

    @NotBlank(message = "Company Category is required.")
    @Pattern(regexp = "^(Startup|MNC)$", message = "Company Category must be either 'Startup' or 'MNC'.")
    private String companyCategory; // Should be either "Startup" or "MNC"

    @NotBlank(message = "Job Description is required.")
    @Size(min = 10, message = "Job Description must be at least 10 characters long.")
    private String jobDescription;
    
    

	public String getJobid() {
		return jobid;
	}
	public void setJobid(String jobid) {
		this.jobid = jobid;
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
