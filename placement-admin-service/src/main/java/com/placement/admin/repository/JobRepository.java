package com.placement.admin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.placement.admin.entity.JobEntityPosting;

@Repository
public interface JobRepository extends JpaRepository<JobEntityPosting, Long> 
{
	Optional<JobEntityPosting> findByJobTitleAndCompanyName(String jobTitle, String companyName);

}
