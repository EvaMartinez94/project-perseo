package com.example.Perseo.service;

import com.example.Perseo.model.WorkExperience;
import com.example.Perseo.repository.IWorkExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkExperienceService {
    @Autowired
    IWorkExperienceRepository iWorkExperienceRepository;

    public WorkExperience createWorkExperiences(WorkExperience newWorkExperience){
        return iWorkExperienceRepository.save(newWorkExperience);
    }
    public List<WorkExperience> getAllWorkExperiences(){
        return (List<WorkExperience>) iWorkExperienceRepository.findAll();
    }
    public Optional<WorkExperience> getWorkExperiencesbyId(int id){
        WorkExperience workExperience = iWorkExperienceRepository.findById(id).orElseThrow();
        return Optional.of(workExperience);
    }
    public void updateWorkExperiences(WorkExperience workExperience, int id){
        workExperience.setId(id);
        iWorkExperienceRepository.save(workExperience);
    }
    public void deleteWorkExperiences(int id){
        iWorkExperienceRepository.deleteById(id);
    }
}
