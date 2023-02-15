package com.example.Java.Controller;

import com.example.Java.Entities.departmentEntity;
import com.example.Java.Reposotories.deparrtmentReposotorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class departmentController {
    @Autowired
    deparrtmentReposotorie deparrtmentReposotorie;

    @PostMapping("/dbdepartment/add")
    public HttpStatus Adddepartment(@RequestParam String name, @RequestParam String officeNum){
        departmentEntity newDepartment=new departmentEntity(name,officeNum);
        deparrtmentReposotorie.save(newDepartment);
        return HttpStatus.OK;
    }
}
