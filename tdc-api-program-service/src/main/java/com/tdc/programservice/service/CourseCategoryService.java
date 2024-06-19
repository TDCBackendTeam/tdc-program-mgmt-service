package com.tdc.programservice.service;

import com.tdc.programservice.entity.Batch;
import com.tdc.programservice.entity.CourseCategory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface CourseCategoryService {
    List<CourseCategory> getAllCourseCategory();
    Optional<CourseCategory> getCourseCategoryById(int cat_id);
}
