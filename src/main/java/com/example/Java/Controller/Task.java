package com.example.Java.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class Task {
    ArrayList<String>teacher=new ArrayList<String>();
    @ResponseBody
    @PostMapping("/teacher/add")
    public String addteacher(@RequestParam String teachername){
        this.teacher.add(teachername);
        return "Successfully add "+teachername;
    }
    @ResponseBody
    @GetMapping("/teacher/search/{id}")
    public String searchteacher(@PathVariable("id") int id){
        return this.teacher.get(id);


    }
    @ResponseBody
    @GetMapping("/techer/all")
    public ArrayList<String> allteacher(){
        return this.teacher;
    }
    @ResponseBody
    @PutMapping("/teacher/update/{id}")
    public String citizinupdat(@RequestParam String thechername ,@PathVariable int id){
        this.teacher.set(id,thechername);
        return "update Successfully ";
    }
    @ResponseBody
    @DeleteMapping("/teacher/delet/{id}")
    public String Searcha(@PathVariable ("id") int id){
        this.teacher.remove(id);
        return "Successfully delete !!";
    }


}
