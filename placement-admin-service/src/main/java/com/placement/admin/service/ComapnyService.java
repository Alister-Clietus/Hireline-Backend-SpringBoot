package com.placement.admin.service;


import com.placement.admin.dto.CompanyDTO;
import com.placement.admin.dto.ServiceResponse;

public interface ComapnyService 
{
	public ServiceResponse getAllCompany();
	public ServiceResponse deleteCompanyDetails(CompanyDTO companyDTO);
	public ServiceResponse verifyCompanyDetails(CompanyDTO companyDTO);
	public ServiceResponse addCompanyDetails(CompanyDTO companyDTO);
	public ServiceResponse getCompanyDetailsbyname(CompanyDTO companyDTO);

}
