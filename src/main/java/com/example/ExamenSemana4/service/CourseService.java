package com.example.ExamenSemana4.service;

import com.example.ExamenSemana4.entity.Course;
import com.example.ExamenSemana4.repository.CourseRepository;
import com.example.ExamenSemana4.repository.ExpedientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    ExpedientRepository expedientRepository;

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return (List<Course>) courseRepository.findAll();
    }

    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    public void deleteCourse(Course course) {
        expedientRepository.deleteExpedientByCourse(course);
        courseRepository.delete(course);
    }

    public String getCourseDuration(Course course) {
        return courseRepository.getCourseDuration(course.getId());

    }

    public String getNameOfCourseById(Course course) {
        return courseRepository.getNameOfCourseById(course.getId());
    }
}
