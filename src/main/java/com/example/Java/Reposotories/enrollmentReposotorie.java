package com.example.Java.Reposotories;

import com.example.Java.Entities.enrollmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface enrollmentReposotorie extends JpaRepository<enrollmentEntity,Long> {
}
