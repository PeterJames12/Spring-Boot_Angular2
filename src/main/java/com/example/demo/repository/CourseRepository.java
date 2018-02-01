package com.example.demo.repository;

import com.example.demo.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Igor Hnes on 2/1/18.
 */
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByUserId(Long userId);
}
