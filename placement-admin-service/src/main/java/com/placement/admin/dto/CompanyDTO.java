package com.placement.admin.dto;
import jakarta.validation.constraints.*;

public class CompanyDTO 
{
	@NotBlank(message = "Company name is required")
    @Size(min = 3, max = 100, message = "Company name must be between 3 and 100 characters")
    private String companyName;

    @NotBlank(message = "Job title is required")
    private String jobTitle;

    @NotNull(message = "Average LPA is required")
    @Pattern(regexp = "^[0-9]+(\\.[0-9]{1,2})?$", message = "Invalid LPA format")
    private String averageLpaProvided;

    @NotBlank(message = "Bond requirement must be specified")
    private String bondRequired;

    @NotBlank(message = "Company website is required")
    @Pattern(regexp = "^(https?:\\/\\/)?([\\w\\-]+\\.)+[\\w]{2,}(\\/.*)?$", message = "Invalid website URL")
    private String companyWebsite;

    @NotNull(message = "Last year's recruited students count is required")
    @Pattern(regexp = "^[0-9]+$", message = "Must be a valid number")
    private String lastYearRecruitedStudents;

    @NotNull(message = "Company started year is required")
    @Pattern(regexp = "^(19|20)\\d{2}$", message = "Must be a valid year (1900-2099)")
    private String companyStartedYear;

    @NotBlank(message = "Specify if MNC or Startup")
    private String mncOrStartup;

    @NotBlank(message = "Type of recruitment is required")
    private String typeOfRecruitment;

    @NotBlank(message = "Work culture description is required")
    @Size(min = 10, max = 300, message = "Work culture description must be between 10 and 300 characters")
    private String workCulture;
    
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getAverageLpaProvided() {
		return averageLpaProvided;
	}
	public void setAverageLpaProvided(String averageLpaProvided) {
		this.averageLpaProvided = averageLpaProvided;
	}
	public String getBondRequired() {
		return bondRequired;
	}
	public void setBondRequired(String bondRequired) {
		this.bondRequired = bondRequired;
	}
	public String getCompanyWebsite() {
		return companyWebsite;
	}
	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}
	public String getLastYearRecruitedStudents() {
		return lastYearRecruitedStudents;
	}
	public void setLastYearRecruitedStudents(String lastYearRecruitedStudents) {
		this.lastYearRecruitedStudents = lastYearRecruitedStudents;
	}
	public String getCompanyStartedYear() {
		return companyStartedYear;
	}
	public void setCompanyStartedYear(String companyStartedYear) {
		this.companyStartedYear = companyStartedYear;
	}
	public String getMncOrStartup() {
		return mncOrStartup;
	}
	public void setMncOrStartup(String mncOrStartup) {
		this.mncOrStartup = mncOrStartup;
	}
	public String getTypeOfRecruitment() {
		return typeOfRecruitment;
	}
	public void setTypeOfRecruitment(String typeOfRecruitment) {
		this.typeOfRecruitment = typeOfRecruitment;
	}
	public String getWorkCulture() {
		return workCulture;
	}
	public void setWorkCulture(String workCulture) {
		this.workCulture = workCulture;
	}
    
    

}
