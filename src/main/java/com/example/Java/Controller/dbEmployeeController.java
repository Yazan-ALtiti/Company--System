package com.example.Java.Controller;

import com.example.Java.DTO.employeeDTO;
import com.example.Java.Entities.departmentEntity;
import com.example.Java.Entities.employeeEntity;
import com.example.Java.Reposotories.deparrtmentReposotorie;
import com.example.Java.Reposotories.employeeRepsotorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class dbEmployeeController {
    @Autowired
    employeeRepsotorie employeeRepsotorie;
    @Autowired
    deparrtmentReposotorie deparrtmentReposotorie;


    @PostMapping("/dbemployee/add")
    public HttpStatus newEmployee(@RequestBody employeeDTO employee) {
        departmentEntity departmentEntity=deparrtmentReposotorie.findById(employee.getDepartment_id()).orElseThrow(()->new IllegalArgumentException("invalid id"+employee.getDepartment_id()));
        employeeEntity employeeEntity = new employeeEntity(employee.getName(), employee.getPhone(), employee.getEmail(), employee.getSalary(),departmentEntity);
        employeeRepsotorie.save(employeeEntity);
        return HttpStatus.OK;
    }
    @PostMapping("/dbemployee/find")
    public employeeEntity findEmployee(@RequestParam Long id){

         employeeEntity employee=employeeRepsotorie.findById(id).orElseThrow(()->new IllegalArgumentException("invalid user id"+id));
        return employee;
    }
    @GetMapping("/dbemployee/findcontact/{id}")
    public employeeDTO findContactInfo(@PathVariable ("id")Long id){
        employeeEntity employee=employeeRepsotorie.findById(id).orElseThrow(()->new IllegalArgumentException("invalid user id"+id));
        employeeDTO contactInfo=new employeeDTO(employee.getPhone(),employee.getEmail());
        return contactInfo;
    }

}
