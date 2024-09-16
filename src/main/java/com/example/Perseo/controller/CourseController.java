package com.example.Perseo.controller;

import com.example.Perseo.model.Course;
import com.example.Perseo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/perseo/courses")
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping(path = "post")
    public Course createCourses(@RequestBody Course course){
        return courseService.createCourses(course);
    }
    @GetMapping(path = "get")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }
    @GetMapping(path = "get/{id}")
    public Optional<Course> getCoursesbyId(@PathVariable int id){
        return courseService.getCoursesbyId(id);
    }

    @PutMapping(path = "put/{id}")
    public void updateCourses(@RequestBody Course course, @PathVariable int id){
        courseService.updateCourses(course, id);
    }
    @DeleteMapping(path = "delete/{id}")
    public void deleteCourses(@PathVariable int id){
        courseService.deleteCourses(id);
    }

}
