package com.example.Java.Controller;

import com.example.Java.Entities.employeeEntity;
import com.example.Java.Reposotories.employeeRepsotorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dbEmployeeController {
    @Autowired
    employeeRepsotorie employeeRepsotorie;

    @PostMapping("/dbemployee/add")
    public HttpStatus newEmployee(@RequestParam String name, @RequestParam String phone, @RequestParam String email, @RequestParam int salary) {
        employeeEntity employeeEntity = new employeeEntity(name, phone,email,salary);
        employeeRepsotorie.save(employeeEntity);
        return HttpStatus.OK;
    }
    @PostMapping("/dbemployee/find")
    public employeeEntity findEmployee(@RequestParam Long id){

         employeeEntity employee=employeeRepsotorie.findById(id).orElseThrow(()->new IllegalArgumentException("invalid user id"+id));
        return employee;
    }
}
