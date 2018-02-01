package com.example.demo.controller;

import com.example.demo.model.Course;
import com.example.demo.model.User;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Igor Hnes on 2/1/18.
 */
@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/all")
    public List<Course> findAll() {
        return courseService.findAll();
    }

    @RequestMapping("/byUserId")
    public List<Course> findByUserId(@RequestParam Long userId) {
        return courseService.findByUserId(userId);
    }

    @PostMapping
    public Course create(@RequestBody Course course) {
        return courseService.create(course);
    }

    @DeleteMapping
    public void deleteById(@RequestParam Long courseId) {
        courseService.delete(courseId);
    }

    @PutMapping
    public Course update(@RequestBody Course course) {
        return courseService.update(course);
    }
}
