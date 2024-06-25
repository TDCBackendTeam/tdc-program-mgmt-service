package com.tdc.programservice.service;

import com.tdc.programservice.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface CourseService {
 List<Course> getAllCourse();
 Optional<Course> getCourseById(int courseId);
 Course findByName(String name);
 Course updateCourse(Course courses);
 void deleteCourse(Integer course_Id);
 Course createCourse(Course course);
}
