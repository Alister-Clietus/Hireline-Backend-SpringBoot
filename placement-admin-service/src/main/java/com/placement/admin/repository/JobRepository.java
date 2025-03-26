package com.placement.admin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.placement.admin.entity.JobEntityPosting;

@Repository
public interface JobRepository extends JpaRepository<JobEntityPosting, Long> 
{
	Optional<JobEntityPosting> findByJobTitleAndCompanyName(String jobTitle, String companyName);
    // Count jobs by status (e.g., VERIFIED)
    long countByStatus(String status);

    // Custom query to find the highest salary
    @Query("SELECT MAX(j.salary) FROM JobEntityPosting j")
    Double findHighestSalary();

    Optional<JobEntityPosting> findByEmailId(String emailId);
}
