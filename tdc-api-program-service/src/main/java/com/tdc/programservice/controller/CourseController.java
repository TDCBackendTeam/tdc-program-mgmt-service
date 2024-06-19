package com.tdc.programservice.controller;

import com.tdc.programservice.entity.Course;
import com.tdc.programservice.service.impl.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/course")
public class CourseController {
    @Autowired
    //private CourseService courseServiceImpl;
    private final CourseServiceImpl courseServiceImpl;

    public CourseController(CourseServiceImpl courseServiceImpl) {

        this.courseServiceImpl = courseServiceImpl;
    }

    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        try {
            Course saveCourse = courseServiceImpl.createCourse(course);
            return new ResponseEntity<>(saveCourse, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        try {
            List<Course> coursesList = courseServiceImpl.getAllCourse();
            return new ResponseEntity<>(coursesList, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable int id) {
        try {
            return courseServiceImpl.getCourseById(id)
                    .map(ResponseEntity::ok)
                    .orElseGet(() -> ResponseEntity.notFound().build());
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        }
    }
    @GetMapping("/find/{name}")
    @ResponseBody
    public Course findByName(@PathVariable String name) {
        try {
            return courseServiceImpl.findByName(name);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    @PutMapping("{id}")
    public ResponseEntity<Course> updateCourses(@PathVariable("id") Integer course_id, @RequestBody Course course) {
        course.setCourse_id(course_id);
        Course courseUpdate = courseServiceImpl.updateCourse(course);
        return new ResponseEntity<>(courseUpdate, HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable("id") Integer course_id) {
        courseServiceImpl.deleteCourse(course_id);
        return new ResponseEntity<>("Courses Deleted Successfully", HttpStatus.OK);
    }
}
