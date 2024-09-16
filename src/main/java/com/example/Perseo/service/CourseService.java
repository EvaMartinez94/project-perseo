package com.example.Perseo.service;

import com.example.Perseo.model.Course;
import com.example.Perseo.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    ICourseRepository iCourseRepository;

    public Course createCourses(Course newCourse){
        return iCourseRepository.save(newCourse);
    }
    public List<Course> getAllCourses(){
        return (List<Course>) iCourseRepository.findAll();
    }
    public Optional<Course> getCoursesbyId(int id){
        Course course = iCourseRepository.findById(id).orElseThrow();
        return Optional.of(course);
        }

        public void updateCourses(Course course, int id) {
            course.setId(id);
            iCourseRepository.save(course);
        }
        public void deleteCourses(int id) {
        iCourseRepository.deleteById(id);
        }
    }

