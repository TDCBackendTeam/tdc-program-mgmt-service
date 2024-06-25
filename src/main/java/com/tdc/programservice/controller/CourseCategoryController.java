package com.tdc.programservice.controller;

import com.tdc.programservice.entity.Batch;
import com.tdc.programservice.entity.CourseCategory;
import com.tdc.programservice.service.CourseCategoryService;
import com.tdc.programservice.service.impl.CourseCategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/course-category")
public class CourseCategoryController {
    @Autowired
    private CourseCategoryService courseCategoryService;
    @GetMapping
    public ResponseEntity<List<CourseCategory>> getAllCourseCategory(){
        List<CourseCategory> courseCategoryList = courseCategoryService.getAllCourseCategory();
        return new ResponseEntity<>(courseCategoryList, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<CourseCategory> getCourseCategoryById(@PathVariable int id){

        return courseCategoryService.getCourseCategoryById(id)
                .map(ResponseEntity::ok)
                .orElseGet(()->ResponseEntity.notFound().build());
    }

}
