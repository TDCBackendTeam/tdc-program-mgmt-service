package com.tdc.programservice.service.impl;
import com.tdc.programservice.entity.CourseCategory;
import com.tdc.programservice.repository.CourseCategoryRepository;
import com.tdc.programservice.service.CourseCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CourseCategoryServiceImpl implements CourseCategoryService {
    @Autowired
    private CourseCategoryRepository courseCategoryRepository;
    @Override
    public List<CourseCategory> getAllCourseCategory() {
        return courseCategoryRepository.findAll();
    }
    @Override
    public Optional<CourseCategory> getCourseCategoryById(int cat_id) {
        return courseCategoryRepository.findById(cat_id);
    }
}
