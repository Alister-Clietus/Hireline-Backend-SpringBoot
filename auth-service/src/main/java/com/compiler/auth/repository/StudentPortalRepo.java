package com.compiler.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compiler.auth.entity.StudentPortalEntity;

public interface StudentPortalRepo extends JpaRepository<StudentPortalEntity, Long>
{

}
