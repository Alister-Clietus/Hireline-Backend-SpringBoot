package com.compiler.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compiler.auth.entity.StudentPortalEntity;

public interface StudentPortalRepo extends JpaRepository<StudentPortalEntity, Long>
{
	Optional<StudentPortalEntity> findByEmail(String email);
}
