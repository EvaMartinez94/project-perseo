package com.example.Perseo.repository;

import com.example.Perseo.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepository extends JpaRepository<Course, Integer> {}
