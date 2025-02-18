package com.placement.admin.repository;
//Packeges Import
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//Classes and Interface Import
import com.placement.admin.entity.EmailEntity;

@Repository
public interface EmailFetchRepo extends JpaRepository<EmailEntity, Long>
{

}
