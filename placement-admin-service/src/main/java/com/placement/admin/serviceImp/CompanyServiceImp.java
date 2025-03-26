package com.placement.admin.serviceImp;

import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placement.admin.dto.CompanyDTO;
import com.placement.admin.dto.ServiceResponse;
import com.placement.admin.entity.CompanyEntity;
import com.placement.admin.repository.CompanyRepository;
import com.placement.admin.service.ComapnyService;
import com.placement.admin.util.Constants;

@Service
public class CompanyServiceImp implements ComapnyService
{
	@Autowired
	CompanyRepository companyrepo;

	
	public ServiceResponse getAllCompany() 
	{
	    try {
	        // Fetch all company records
	    	JSONObject result = new JSONObject();
	        List<CompanyEntity> companyList = companyrepo.findAll();

	        if (companyList.isEmpty()) {
	            return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "No companies found", null);
	        }

	        // Convert each company entity to a Map<String, Object> for JSON response
	        List<Map<String, Object>> companyDataList = new ArrayList<>();
	        for (CompanyEntity company : companyList) {
	            Map<String, Object> companyMap = new HashMap<>();
	            companyMap.put("id", company.getId());
	            companyMap.put("companyName", company.getCompanyName());
	            companyMap.put("jobTitle", company.getJobTitle());
	            companyMap.put("averageLpaProvided", company.getAverageLpaProvided());
	            companyMap.put("bondRequired", company.getBondRequired());
	            companyMap.put("companyWebsite", company.getCompanyWebsite());
	            companyMap.put("lastYearRecruitedStudents", company.getLastYearRecruitedStudents());
	            companyMap.put("companyStartedYear", company.getCompanyStartedYear());
	            companyMap.put("mncOrStartup", company.getMncOrStartup());
	            companyMap.put("typeOfRecruitment", company.getTypeOfRecruitment());
	            companyMap.put("workCulture", company.getWorkCulture());
	            companyMap.put("status", company.getStatus());

	            companyDataList.add(companyMap);
	            result.put("aaData", companyDataList);
	        }

	        return new ServiceResponse(Constants.MESSAGE_STATUS.Success, "Company details retrieved successfully", result);
	    } catch (Exception e) {
	        return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Error retrieving company details", null);
	    }
	}


	
	public ServiceResponse deleteCompanyDetails(CompanyDTO companyDTO) 
	{
	    try {
	        // Check if the company exists
	        Optional<CompanyEntity> companyOptional = companyrepo.findByCompanyName(companyDTO.getCompanyName());

	        if (companyOptional.isPresent()) {
	        	CompanyEntity company = companyOptional.get();
	            companyrepo.delete(company); // Delete the company

	            return new ServiceResponse(Constants.MESSAGE_STATUS.Success, "Company deleted successfully", null);
	        } else {
	            return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Company not found", null);
	        }
	    } catch (Exception e) {
	        return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Error deleting company details", null);
	    }
	}


	
	public ServiceResponse verifyCompanyDetails(CompanyDTO companyDTO) 
	{
	    try {
	        // Check if the company exists
	        Optional<CompanyEntity> companyOptional = companyrepo.findByCompanyName(companyDTO.getCompanyName());

	        if (companyOptional.isPresent()) {
	        	CompanyEntity company = companyOptional.get();
	            company.setStatus("VERIFIED"); // Update status to VERIFIED
	            companyrepo.save(company); // Save changes

	            return new ServiceResponse(Constants.MESSAGE_STATUS.Success, "Company details verified successfully", null);
	        } else {
	            return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Company not found", null);
	        }
	    } catch (Exception e) {
	        return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Error verifying company details", null);
	    }
	}
	
	
	public ServiceResponse pendingCompanyDetails(CompanyDTO companyDTO) 
	{
	    try {
	        // Check if the company exists
	        Optional<CompanyEntity> companyOptional = companyrepo.findByCompanyName(companyDTO.getCompanyName());

	        if (companyOptional.isPresent()) 
	        {
	        	CompanyEntity company = companyOptional.get();
	            company.setStatus("PENDING"); // Update status to VERIFIED
	            companyrepo.save(company); // Save changes

	            return new ServiceResponse(Constants.MESSAGE_STATUS.Success, "Company details verified successfully", null);
	        } 
	        else 
	        {
	            return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Company not found", null);
	        }
	    } catch (Exception e) 
	    {
	        return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Error verifying company details", null);
	    }
	}


	
	public ServiceResponse addCompanyDetails(CompanyDTO companyDTO) 
	{
		
		 try {
		        // Check if the company already exists
		        Optional<CompanyEntity> existingCompany = companyrepo.findByCompanyName(companyDTO.getCompanyName());
		        if (existingCompany.isPresent()) {
		            return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Company already exists", null);
		        }

		        // Create new Company entity
		        CompanyEntity company = new CompanyEntity();
		        company.setCompanyName(companyDTO.getCompanyName());
		        company.setJobTitle(companyDTO.getJobTitle());
		        company.setAverageLpaProvided(companyDTO.getAverageLpaProvided());
		        company.setBondRequired(companyDTO.getBondRequired());
		        company.setCompanyWebsite(companyDTO.getCompanyWebsite());
		        company.setLastYearRecruitedStudents(companyDTO.getLastYearRecruitedStudents());
		        company.setCompanyStartedYear(companyDTO.getCompanyStartedYear());
		        company.setMncOrStartup(companyDTO.getMncOrStartup());
		        company.setTypeOfRecruitment(companyDTO.getTypeOfRecruitment());
		        company.setWorkCulture(companyDTO.getWorkCulture());
		        company.setStatus("PENDING"); // Default status
		        // Save company
		        companyrepo.save(company);
		        return new ServiceResponse(Constants.MESSAGE_STATUS.Success, "Company details added successfully", null);
		    } catch (Exception e) {
		        return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Error adding company details", null);
		    }
	}

	
	public ServiceResponse getCompanyDetailsbyname(CompanyDTO companyDTO) 
	{ 
	    try {
	        // Find company by name
	    	JSONObject result = new JSONObject();
	        Optional<CompanyEntity> companyOptional = companyrepo.findByCompanyName(companyDTO.getCompanyName());
	        
	        if (companyOptional.isPresent()) {
	        	CompanyEntity company = companyOptional.get();

	            // Convert entity to a JSON-compatible map
	            Map<String, Object> companyDetails = new HashMap<>();
	            companyDetails.put("companyName", company.getCompanyName());
	            companyDetails.put("jobTitle", company.getJobTitle());
	            companyDetails.put("averageLpaProvided", company.getAverageLpaProvided());
	            companyDetails.put("bondRequired", company.getBondRequired());
	            companyDetails.put("companyWebsite", company.getCompanyWebsite());
	            companyDetails.put("lastYearRecruitedStudents", company.getLastYearRecruitedStudents());
	            companyDetails.put("companyStartedYear", company.getCompanyStartedYear());
	            companyDetails.put("mncOrStartup", company.getMncOrStartup());
	            companyDetails.put("typeOfRecruitment", company.getTypeOfRecruitment());
	            companyDetails.put("workCulture", company.getWorkCulture());
	            companyDetails.put("status", company.getStatus());
	            result.put("aaData", companyDetails);
	            return new ServiceResponse(Constants.MESSAGE_STATUS.Success, "Company details retrieved successfully", result);
	        } else {
	            return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Company not found", null);
	        }
	    } catch (Exception e) {
	        return new ServiceResponse(Constants.MESSAGE_STATUS.fail, "Error retrieving company details",null);
	    }
	}


	public ServiceResponse getCompanyStatistics() 
	{
	    JSONObject result = new JSONObject();
	    Map<String, Object> stats = new HashMap<>();

	    try {
	        stats.put("totalCompanies", companyrepo.count());
	        stats.put("totalHybridCompanies", companyrepo.countByTypeOfRecruitment("Hybrid"));
	        stats.put("totalRemoteCompanies", companyrepo.countByTypeOfRecruitment("Remote"));
	        stats.put("totalInPersonCompanies", companyrepo.countByTypeOfRecruitment("In-person"));
	        stats.put("highestLpaOffered", companyrepo.findHighestLpa());
	        stats.put("mostRecruitedCompany", companyrepo.findMostRecruitedCompany());
	        stats.put("companiesWithBond", companyrepo.countByBondRequired("Yes"));
	        stats.put("totalMNC", companyrepo.countByMncOrStartup("MNC"));
	        stats.put("totalStartup", companyrepo.countByMncOrStartup("Startup"));
	        stats.put("pendingCompanies", companyrepo.countByStatus("PENDING"));
	        stats.put("verifiedCompanies", companyrepo.countByStatus("VERIFIED"));

	        result.put("aaData", stats);

	        return new ServiceResponse(Constants.MESSAGE_STATUS.Success, "Company details retrieved successfully", result);
	    } catch (Exception e) {
	        e.printStackTrace(); // Logging the exception for debugging
	        return new ServiceResponse(Constants.MESSAGE_STATUS.Fail, "Error fetching company statistics: " + e.getMessage(), null);
	    }
	}


	




}
