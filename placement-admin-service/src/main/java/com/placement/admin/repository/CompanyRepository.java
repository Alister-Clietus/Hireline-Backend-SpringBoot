package com.placement.admin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.placement.admin.entity.CompanyEntity;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> 
{
	Optional<CompanyEntity> findByCompanyName(String companyName);
	
    @Query("SELECT COUNT(c) FROM CompanyEntity c WHERE c.mncOrStartup = :type")
    long countByMncOrStartup(String type);

    @Query("SELECT COUNT(c) FROM CompanyEntity c WHERE c.typeOfRecruitment = :type")
    long countByTypeOfRecruitment(String type);

    @Query("SELECT COUNT(c) FROM CompanyEntity c WHERE c.bondRequired = :bond")
    long countByBondRequired(String bond);

    @Query("SELECT COUNT(c) FROM CompanyEntity c WHERE c.status = :status")
    long countByStatus(String status);

    @Query("SELECT MAX(c.averageLpaProvided) FROM CompanyEntity c")
    String findHighestLpa();

    @Query("SELECT c.companyName FROM CompanyEntity c ORDER BY c.lastYearRecruitedStudents DESC LIMIT 1")
    String findMostRecruitedCompany();

}