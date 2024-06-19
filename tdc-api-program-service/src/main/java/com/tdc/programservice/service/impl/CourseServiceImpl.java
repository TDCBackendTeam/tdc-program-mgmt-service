package com.tdc.programservice.service.impl;
import com.tdc.programservice.entity.Course;
import com.tdc.programservice.repository.CourseRepository;
import com.tdc.programservice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public List<Course> getAllCourse() {

        return courseRepository.findAll();
    }
    @Override
    public Optional<Course> getCourseById(int courseId) {

        return courseRepository.findById(courseId);
    }
    @Override
    public Course findByName(String name) {

        return courseRepository.findByCourseName(name);
    }
    @Override
    public Course updateCourse(Course course) {

        Course existingCourse=courseRepository.findById(course.getCourse_id()).get();
        existingCourse.setCourse_name(course.getCourse_name());
        existingCourse.setCourse_fee(course.getCourse_fee());
        existingCourse.setDetails(course.getDetails());
        existingCourse.setDuration(course.getDuration());
        existingCourse.setBatch_id(course.getBatch_id());
        existingCourse.setYear(course.getYear());
        Course updateCourse=courseRepository.save(existingCourse);
        return updateCourse;
    }
    @Override
    public void deleteCourse(Integer courseId) {
        courseRepository.deleteById(courseId);
    }
    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }
}
