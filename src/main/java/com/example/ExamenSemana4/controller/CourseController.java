package com.example.ExamenSemana4.controller;

import com.example.ExamenSemana4.entity.Course;
import com.example.ExamenSemana4.exception.InexistenteException;
import com.example.ExamenSemana4.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping
    public ResponseEntity<Course> addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
        return ResponseEntity.ok(course);
    }

    @GetMapping("/allcourses")
    public List<Course> getAllCourse() {
        return courseService.getAllCourses();
    }

    @PutMapping("/updatecourse")
    public ResponseEntity<String> updateCourse(@RequestBody Course course) {
        courseService.updateCourse(course);
        return ResponseEntity.ok("Actualizacion exitosa");
    }

    @DeleteMapping("/deletecourse")
    public ResponseEntity<Course> deleteCourse(@RequestBody Course course) {
        courseService.deleteCourse(course);
        return ResponseEntity.ok(course);
    }

    @GetMapping("/courseduration")
    public ResponseEntity<String> courseDuration(@RequestBody Course course) throws InexistenteException {
        if (courseService.getNameOfCourseById(course)==null ) {
            throw new InexistenteException("Course not found");
        }
        return ResponseEntity.ok(courseService.getNameOfCourseById(course) + " course duration: " + courseService.getCourseDuration(course));
    }
}
