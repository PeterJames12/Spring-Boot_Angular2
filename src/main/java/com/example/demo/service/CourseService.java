package com.example.demo.service;

import com.example.demo.model.Course;

import java.util.List;

/**
 * @author Igor Hnes on 2/1/18.
 */
public interface CourseService {

    List<Course> findAll();

    List<Course> findByUserId(Long userId);

    Course create(Course course);

    void delete(Long courseId);

    Course update(Course course);
}
