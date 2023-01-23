package com.example.Java.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class CitizensController {
    ArrayList<String>Citizensnum=new ArrayList<String>();
    @ResponseBody
    @PostMapping("/Citizens/add")
    public String addCitizen(@RequestParam String Citizenname){
        this.Citizensnum.add(Citizenname);
        return "Successfully add "+Citizenname;

    }

    @ResponseBody
    @GetMapping("/Citizen/Search/{id}")
    public String Search(@PathVariable ("id") int id){
        return this.Citizensnum.get(id);
    }
    @ResponseBody
    @GetMapping("/Citizen/all")
    public ArrayList<String> allcitizen(){
        return this.Citizensnum;
    }
    @ResponseBody
    @PutMapping("/citizin/update/{id}")
    public String citizinupdat(@RequestParam String Citizinname ,@PathVariable int id){
        this.Citizensnum.set(id,Citizinname);
        return "update Successfully ";
    }
    @ResponseBody
    @DeleteMapping("/citizen/delet/{id}")
    public String Searcha(@PathVariable ("id") int id){
        this.Citizensnum.remove(id);
        return "Successfully delete";
    }

}
