package com.example.Java.Reposotories;

import com.example.Java.Entities.employeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepsotorie extends JpaRepository<employeeEntity,Long> {
}
