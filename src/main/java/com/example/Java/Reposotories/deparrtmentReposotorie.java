package com.example.Java.Reposotories;

import com.example.Java.Entities.departmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface deparrtmentReposotorie extends JpaRepository<departmentEntity,Long> {

}
