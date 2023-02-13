package com.example.Java.Controller;

import com.example.Java.models.Employee;
import lombok.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;


@Controller

public class EmployeeController {
    ArrayList<Employee> EmloyeeData = new ArrayList<Employee>();

    @ResponseBody
    @PostMapping("/employee/add")
    public String AddEmployee(@RequestParam String name, @RequestParam double salary) {
        Employee employee = new Employee(name, EmloyeeData.size() + 1, salary);
        EmloyeeData.add(employee);
        return "successful";
    }

    @ResponseBody
    @GetMapping("/employee/all")
    public ArrayList<Employee> AllEmployee() {
        return this.EmloyeeData;

    }

    @ResponseBody
    @PutMapping("/employee/update/{id}")
    public String UbdateEmployee(@RequestParam String name, @RequestParam double salary, @PathVariable int id) {
        Employee employee = EmloyeeData.get(id);
        employee.setName(name);
        employee.setSalary(salary);
        // other way
        //   Employee newEmployee=new Employee(name,id,salary);
        //   EmloyeeData.set(id,newEmployee);


        return "update Successfully";
    }


}
