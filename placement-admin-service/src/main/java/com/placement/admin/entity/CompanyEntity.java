package com.placement.admin.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "companies")
public class CompanyEntity 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_name", nullable = false)
    @NotBlank(message = "Company name is required")
    private String companyName;

    @Column(name = "job_title", nullable = false)
    @NotBlank(message = "Job title is required")
    private String jobTitle;

    @Column(name = "average_lpa_provided", nullable = false)
    @NotBlank(message = "Average LPA provided is required")
    private String averageLpaProvided;

    @Column(name = "bond_required", nullable = false)
    @NotBlank(message = "Bond requirement is required")
    private String bondRequired;

    @Column(name = "company_website", nullable = false)
    @NotBlank(message = "Company website is required")
    private String companyWebsite;

    @Column(name = "last_year_recruited_students", nullable = false)
    @NotBlank(message = "Last year's recruited students is required")
    private String lastYearRecruitedStudents;

    @Column(name = "company_started_year", nullable = false)
    @NotBlank(message = "Company started year is required")
    private String companyStartedYear;

    @Column(name = "mnc_or_startup", nullable = false)
    @NotBlank(message = "Company category (MNC or Startup) is required")
    private String mncOrStartup;

    @Column(name = "type_of_recruitment", nullable = false)
    @NotBlank(message = "Type of recruitment is required")
    private String typeOfRecruitment;

    @Column(name = "work_culture", columnDefinition = "TEXT", nullable = false)
    @NotBlank(message = "Work culture is required")
    private String workCulture;
    
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
