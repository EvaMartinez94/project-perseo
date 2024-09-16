package com.example.Perseo.controller;


import com.example.Perseo.model.WorkExperience;
import com.example.Perseo.service.WorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/perseo/workexperiences")
public class WorkExperienceController {
    @Autowired
    WorkExperienceService workExperienceService;

    @PostMapping(path = "post")
    public WorkExperience createWorkExperiences(@RequestBody WorkExperience workExperience){
        return workExperienceService.createWorkExperiences(workExperience);
    }
    @GetMapping(path = "get")
    public List<WorkExperience> getAllWorkExperiences(){
        return workExperienceService.getAllWorkExperiences();
    }
    @GetMapping(path = "get/{id}")
    public Optional<WorkExperience> getWorkExperiencesbyId(@PathVariable int id){
        return workExperienceService.getWorkExperiencesbyId(id);
    }

    @PutMapping(path = "put/{id}")
    public void updateWorkExperiences(@RequestBody WorkExperience workExperience, @PathVariable int id){
        workExperienceService.updateWorkExperiences(workExperience, id);
    }
    @DeleteMapping(path = "delete/{id}")
    public void deleteWorkExperiences(@PathVariable int id){
        workExperienceService.deleteWorkExperiences(id);
    }

}
